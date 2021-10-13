package kotlin_code
import java.lang.Exception

/* this */
class ThisClass {
    val a = "ta"
    val b = this
}

fun main(args: Array<String>) {
    /* this */
    val t:ThisClass = ThisClass()
    println(t.a)
    println(t.b)
    println(t.b.a)
    println("==========================")

    /* 例外 */
    val a:String? = null
    try {
        throw Exception("exception")
        println("by try")
    }
    catch (e:Exception) {
        println(e.message)
        println("by catch")
    }
    finally { //可不寫
        println("by finally")
    }
    throw Exception("產生例外")
    println("例外後終止") //不會輸出
}