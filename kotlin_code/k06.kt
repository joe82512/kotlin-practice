package kotlin_code

import java_code.j06

/* enum 列舉 */
//無值列舉
enum class Enum1 {
    a, b, c, d
}
//有值列舉
enum class Enum2 (val value: Int) {
    /* enum class Enum2 private constructor (...) {}
       private constructor 可省略, 但不能為 public */
    a(1), b(2), c(3), d(4);
    fun get_Value():Int {
        return value
    }
}
fun main(args: Array<String>) {
    val e1 = Enum1.c
    println(e1)
    val e2 = Enum2.c
    println(e2.get_Value())
    println(e2.value) //內建
    // 讀取預設值: name 與 ordinal
    println(e1.name)
    println(e1.ordinal)
    println(e2.name)
    println(e2.ordinal)
}