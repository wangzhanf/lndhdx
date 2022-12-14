//ES6 中基于模块化开发的，起到名字空间作用，需要外界访问需要使用export发布
//如果是独立功能，可以采用默认发布 ，需要使用时 采用  import 导入
//获取当前时间（XXXX-XX-XX）
export function getCurDate() {
    var now = new Date();
    var year = now.getFullYear();
    var month = now.getMonth() + 1;
    var day = now.getDate();
    month = month < 10 ? "0" + month : month;
    day = day < 10 ? "0" + day : day;
    return year + "-" + month + "-" + day; //2022-12-09
}
//向sessionStorage中存储一个JSON对象
export function setSessionStorage(keyStr, value) {
    sessionStorage.setItem(keyStr, JSON.stringify(value));
}
//从sessionStorage中获取一个JSON对象（取不到时返回null）
export function getSessionStorage(keyStr) {
    var str = sessionStorage.getItem(keyStr);
    if (str == '' || str == null || str == 'null' || str == undefined) {
        return null;
    } else {
        return JSON.parse(str);
    }
}
//从sessionStorage中移除一个JSON对象
export function removeSessionStorage(keyStr) {
    sessionStorage.removeItem(keyStr);
}
//向localStorage中存储一个JSON对象
export function setLocalStorage(keyStr, value) {
    localStorage.setItem(keyStr, JSON.stringify(value));
}
//从localStorage中获取一个JSON对象（取不到时返回null）
export function getLocalStorage(keyStr) {
    var str = localStorage.getItem(keyStr);
    if (str == '' || str == null || str == 'null' || str == undefined) {
        return null;
    } else {
        return JSON.parse(str);
    }
}
//从localStorage中移除一个JSON对象
export function removeLocalStorage(keyStr) {
    localStorage.removeItem(keyStr);
}