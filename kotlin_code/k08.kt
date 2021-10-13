package kotlin_code
/*
* 資料類別 data :
* 兩格物件相同參數時, 被視為相同
*/
class NormalClass (name:String, age:Int){ //正常類別
    var name:String = name //屬性
    var age:Int = age //屬性
    fun demo() {
        println("NormalClass")
    }
}
data class DataClass (var name:String, var age:Int){ //資料類別
    //必須標記var/val ; 至少有一參數
    fun demo() {
        println("DataClass")
    }
}

fun main(args: Array<String>) {
    var n1 = NormalClass("n", 1)
    var n2 = NormalClass("n", 1)
    n1.demo()
    println(n1)
    println(n1.equals(n2)) //不等價

    var d1 = DataClass("n", 1)
    var d2 = DataClass("n", 1)
    d1.demo()
    println(d1) //無實作
    println(d1.equals(d2)) //等價

    // 複製資料類別
    var d3 = d2.copy(age=100)
    println(d2.equals(d3)) //不等價
    var d4 = d3.copy(age=1)
    println(d2.equals(d4)) //等價

    // 資料解構
    val (x,y) = d1
    println("$x , $y")
}