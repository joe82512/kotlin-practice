package kotlin_code
/* P7-7 */
open class MyClass {
    open fun test() {}
}
fun process(obj: MyClass) {
    obj.test()
}

fun main(args: Array<String>) {
    var n = 20
    process(object : MyClass() {
        override fun test() {
            n = 30
            if (n == 20) {
                println("Y")
            } else {
                println("N")
            }
        }
    })
}