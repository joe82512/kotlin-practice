package kotlin_code
/* 函數類型,視為一種Kotlin獨有的新類型 */

// 高階函數: 函數作為引數, 用->接收輸入參數
fun basicLevel (value:String): String {
    return value
}
fun highLevel ( v1:String, v2:(value:String)->String ) :String {
    var v:String = v1 + v2("<-基本")
    return v
}

fun main(args: Array<String>) {
    //高階函數
    var x = highLevel("高階", ::basicLevel) //用::引用函數類型的物件,反射
    println(x)

    //匿名函數: 函數類型的物件
    var y = fun (a:String, b: String):String = a+b
    println(y("匿名", " 函數"))
    var y2 = fun (a:String, b: String) {
        println(a)
        println(b)
    }
    y2("多行","指令碼")

    //lambda函數 (匿名的一種): 函數類型的物件
    var z = {a:String, b:String ->
        println("test") //多行
        a+b //預設return
    }
    println(z("lambda", " function"))
}