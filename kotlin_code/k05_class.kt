package kotlin_code

class k05_class (var url: String = "no input") { //主建構子, 可用var與val, 但次建構子不行
    /* 建構子 */
    init { //初始化, 即主建構子實體化
        println("網域:" + url.substring(0,8))
    }
    constructor (net: String, value: Int):this(net) { //次建構子
        println(net+value)
    }
    constructor (value: Int):this() { //次建構子, 多載overload
        println("404 not found")
    }
}
/*
* Java 有建構子,
* 但沒有init與constructor, 因此無分主建構子與次建構子;
* 另外Java不能預設參數 ex: var url: String = "no input"
*
* 但 Kotlin 沒有 static, 即沒有靜態方法/成員
* 用 object 解決
* */