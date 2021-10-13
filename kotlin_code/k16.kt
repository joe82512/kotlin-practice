package kotlin_code

fun main(args: Array<String>) {
    /* Null問題相關 */
    val a:String = "a"
    val b:String? = "b"
    val c:String? = null
    println(a.length)
    //println(b.length) //failed,因為可能為null
    println("==========================")
    // 解1: 自動轉換
    if (b!=null) {
        println(b.length)
    }
    else {
        println(null)
    }
    println(b ?: "b") //用其他值取代null
    println(c ?: "-b") //用其他值取代null
    println("==========================")
    // 解2: 加入?
    println(b?.length)
    println(c?.length)
    val listNull: List<String?> = listOf("ABC", "List", null)
    for (l in listNull) {
        l?.let { println(l)}
    }
    println("==========================")
    // 產生NPE(Null Point Exception)
    println(b!!.length) //非null
    println(c!!.length) //null, 輸出NPE(例外), 但可編譯
}