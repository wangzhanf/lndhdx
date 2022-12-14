function multipleCheck(){
    //给全选复选框绑定事件
    $("#choiceToggle").change(function(){
        //将列表所有的复选框改变为和自己同样的状态
        // $('[name="choiceList"]').attr("checked","checked");
        $('[name="choiceList"]').prop("checked",this.checked);
    });
    //给反选按钮绑定事件
    $("#reversBtn").click(function(){
        //console.log(this);
        // $('[name="choiceList"]').prop();
        let flag = true;
        $('[name="choiceList"]').each(function(){
            //重新封装了this
            //console.log(this);
            this.checked = !this.checked;
            if(!this.checked)
                flag = false;
        });
        $("#choiceToggle").prop("checked",flag);
    });
    //给所有的记录条目对应的复选框绑定事件,动态增加的元素需要事件委托
    $("#display tbody").on("change",function(){
        let flag = true;
        $('[name="choiceList"]').each(function (){
            if(!this.checked)
                flag = false;
        });
        $("#choiceToggle").prop("checked",flag);
    });

}
//日期转换 客户端的工具
//基于原型链给某个对象添加成员，所有的Date对象都拥有该成员
// (new Date()).Format

function Abc(){};
Abc.name = "zs";
//  每个showMe都是独立的函数代码
// Abc.showMe = function(){
//     console.log(this.name);
// }
//  每个实例共享同样的函数代码
Abc.showMe = showMeF;
function showMeF(){
    console.log(this.name);
}
function createABC(aname){
    let ret = new Abc();
    ret.name = aname;
    ret.showMe = showMeF;
    return ret;
}

let a1 = createABC("ls");
let a2 = createABC("ww");
a1.showMe();a2.showMe();
//a1.kkk = 'kk';
//console.log(a2.kkk);

Abc.prototype.hello = function(){

}
a1.hello();a2.hello();

let currentDate = new Date();
currentDate.fmt = function(){};


Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, // 月份
        "d+": this.getDate(), // 日
        "H+": this.getHours(), // 小时
        "m+": this.getMinutes(), // 分
        "s+": this.getSeconds(), // 秒
        "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
        "S": this.getMilliseconds()
        // 毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
            .substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
                : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};
//弹框提醒
function myAlert(message, style, time){
    message = (message === undefined) ? '提醒框' : message;
    style = (style === undefined) ? 'bg-success text-white' : style;
    time = (time === undefined) ? 3000 : time;
    $('<div></div>').css({
        "display": "none",
        "position": "fixed",
        "text-align": "center",
        "top": "50%",
        "left": "50%",
        "min-width": "200px",
        "min-height": "20px",
        "margin-left": "-100px",
        "z-index": "99999",
        "padding": "10px 20px 10px 20px",
        "border": "1px solid transparent",
        "border-radius": "4px",
    })
        .appendTo('body')
        .addClass(style)
        .text(message)   //eval(while(true){alert(1)})
        .show()
        .delay(time)
        .fadeOut();
}