package kotlin_code

fun change(s:Any){
    if (s !is String) return //安全智慧轉換
    println(s.length) //無輸出
}

class NewClass (val i:Int) {} //新結構
data class NewDataClass (val i:Int) {} //新資料結構

fun main(args: Array<String>) {
    /* 類型轉換 */
    // 1.相容類:自動轉換
    var obj:Any = 10
    println(obj is Any)
    println(obj is Int) //相容會自動轉換
    println(obj !is Int)
    println("==========================")
    // 2.不同類:智慧轉換
    var s:Any = 10 //非String
    println(change(s)) //kotlin.Unit
    when (s) {
        is Int -> println(s + 1)
        is String -> println(s.length + 1) //安全智慧轉換
        is IntArray -> println(s.sum()) //安全智慧轉換
    }
    println("==========================")
    // 3.不同類:強制轉換 as
    var x1:Any = "10"
    //var y1:Int = x1 as Int //failed
    var x2:Any? = "10"
    var y2:Int? = x2 as? Int? //success
    println(y2) //null
    println("==========================")

    /* 相等判斷 */
    val a = NewClass(10) //class
    val b = NewClass(10)
    val da = NewDataClass(10) //data class
    val db = NewDataClass(10)
    println(a==b) //false
    println(a===b) //false
    println(da==db) //true
    println(da===db) //false
    println("==========================")
}