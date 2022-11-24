/*整个站点的js脚本*/
//封装好的Promise,异步请求推荐使用该方法，只需要编写一次
/*使用方式
getData('get|post','url').then(function (数据) {
    成功之后的业务处理逻辑
},function (errorInfo) {
    失败之后的业务处理逻辑
});
*/

let getData = function(method,url){
    let promise = new Promise(function(resolve, reject){
        let xhr = new XMLHttpRequest();
        xhr.open(method,url,true);
        xhr.onreadystatechange = processHandler;
        xhr.send();

        function processHandler() {
            if(this.readyState != 4){
                return;//此处要注意，如果中间状态不做处理则会如何呢
            }
            if(this.readyState == 4 && this.status == 200){
                //假定数据全部都是json格式，在通用函数直接转换
                let jsonData = JSON.parse(this.responseText);
                resolve(jsonData);
            }else{
                reject(new Error(this.statusText));
            }
        }
    });
    return promise;
};

function gotoPage(event){
    event.stopPropagation();
    event.preventDefault();
    window.location.href = event.target.getAttribute("data-href");
}
//用户名称检查
function checkUsername(event){
    let flag = false;
    if(event.target.value.length >= 3){
        //访问服务器获取到查重的结果
        getData('get','./data/userCheck.json').then(function (myData) {
            let str='';
            if(!myData.statusCode){//成功提示
                str = '恭喜，该用户名可用';
            }else{
                str = '抱歉，该用户名不可用';
            }
            let oTips = document.createElement('div');
            let oText = document.createTextNode(str);
            oTips.append(oText);
            event.target.parentElement.append(oTips);
        },function (errorInfo) {
            alert('访问失败');
        });
    }else{
        //alert('用户名长度至少3个字母');
    }
    return flag;
}

//获取所有商家数据
//首页逻辑
//JavaScript中事件处理函数默认的第一个参数是 事件对象本身
//javascript中，异步网络请求的成功回调函数默认第一个参数是返回的数据
//ES6之前只有全局变量和函数变量（包括函数的形参）
function businessListIndex() {
    // console.log(globalBusinessData)
    if(!(oUl = document.querySelector('.businessList'))) return false;
    let sStr = ``;
    for (let i = 0; i < globalBusinessData.length; i++) {
        sStr += `
                <li>
                    <a href="${globalBusinessData[i].url}">
                        <p>
                            <img src="${globalBusinessData[i].imgsrc}" />
                            <span>${globalBusinessData[i].tips}</span>
                        </p>
                        <h3>${globalBusinessData[i].title}</h3>
                        <h5>${globalBusinessData[i].star}</h5>
                        <h5>${globalBusinessData[i].distance}</h5>
                        <div>${globalBusinessData[i].role.join(' | ')}</div>
                        <div>${globalBusinessData[i].description}</div>
                    </a>
                </li>
            `;
    }
    oUl.innerHTML = sStr;
}

function filterData(event){
    let iValue = parseInt(event.target.value);
    iValue = iValue <= 0?1:iValue;
    console.log(iValue)
    globalBusinessData = globalBusinessData.filter(function(item,a,b){
        //console.log(item)
        // console.log(a)
        // console.log(b)
        return item.star > iValue;
    });

    businessListIndex();
}

function sortData(event) {
    //switch的表达式结果应该是整数
    switch (event.target.getAttribute('class')){
        case "byName":
            globalBusinessData.sort(function(a,b){
                return a.title - b.title;
            });
            break;
        case "byStar":
            console.log(globalBusinessData)
            globalBusinessData.sort(function(a,b){
                return parseFloat(a.star) - parseFloat(b.star);
            });
            break;
        case "byDistance":
            console.log(3)
            globalBusinessData.sort(function(a,b){
                return parseFloat(a.distance) - parseFloat(b.distance);
            });
            break;
    }
    globalBusinessData.reverse();//数组的响应式操作
    //调用方法修改数组本身。非响应式对全局数组重新赋值

    businessListIndex();


    event.stopPropagation();
    event.preventDefault();
}

//商家列表页面逻辑
function businessList(myData) {
    if(!(oUl = document.querySelector('.businessList'))) return false;
    let sStr = ``;
    for (let i = 0; i < myData.lists.length; i++) {
        sStr += `
                <li>
                    <a href="${myData.lists[i].url}">
                        <p>
                            <img src="${myData.lists[i].imgsrc}" />
                            <span>${myData.lists[i].tips}</span>
                        </p>
                        <h3>${myData.lists[i].title}</h3>
                        <div>${myData.lists[i].role.join(' | ')}</div>
                        <div>${myData.lists[i].description}</div>
                    </a>
                </li>
            `;
    }
    oUl.innerHTML = sStr;
}


function getAllBusiness(){
    getData('get','./data/businessList.json').then(function (myData) {
        //数组之间的直接赋值，本质上就是将数组的地址赋值给另外一个变量
        //
        globalBusinessData = myData.lists;//转换为全局变量
        /*for (let i = 0; i < myData.lists.length; i++) {
            window.globalBusinessData.push(myData.lists[i]);
        }*/
        businessListIndex();//调用渲染函数
    },function (errorInfo) {
        alert("失败之后的业务处理逻辑");
    });
}
//首页获取所有的类别
function getTypes(){
    getData('get','./data/types.json').then(function (myData) {
        if(!(oUl = document.querySelector('.typeList'))) return false;
        let sStr = ``;
        for (let i = 0; i < myData.typeList.length; i++) {
            sStr += `
                <li data-href="./businessList.html">
<!--                    <a href="http://localhost:63342/code/03.%E7%BB%BC%E5%90%88%E9%A1%B9%E7%9B%AE1/businessList.html">-->
<!--                        <a href="/code/03.%E7%BB%BC%E5%90%88%E9%A1%B9%E7%9B%AE1/businessList.html">-->
                    <a href="./businessList.html">
                        <img src="${myData.typeList[i].imgSrc}" />
                        <div>${myData.typeList[i].title}</div>
                    </a>
                </li>
            `;
        }
        //上述通过字符串拼接方式渲染页面的好处，代码直观【模板字符串的作用】
        //缺点细节控制不够【DOM操作细节满满，DOM代码过于冗余，方便绑定事件等操作】。
        oUl.innerHTML = sStr;
    },function(errorInfo){alert("失败之后的业务处理逻辑");});

    //异步代码的执行根据事件确定的，不确定的
    //可以考虑使用, 动态增加的元素绑定事件一般推荐使用事件委托，父监听子的访问
    /*不合适的代码let aLis = document.querySelectorAll('.typeList>li');
    for (let i = 0; i < aLis.length; i++) {
        aLis[i].onclick = function(event){
            console.log(123)；
        };
    }*/
    let oUl = document.querySelector('.typeList');
    oUl.onclick = function(event){
        console.log(event.target);
        gotoPage(event.target.getAttribute('data-href'));
        event.stopPropagation();
        event.preventDefault();
    };
}

