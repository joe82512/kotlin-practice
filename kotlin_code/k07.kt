package kotlin_code
/* 擴充
* 1. 用 . 擴充
* 2. "同類別下"無法擴充相同fun去覆寫
* 3. 內建函數 > 擴充函數 ( 內建 > 不同類別的擴充 > 同類別的擴充 )
* 4. 擴充屬性須先建立屬性初始化
* 5. 範例 P.4-15
* */
open class D {
}
class D1:D() {
}
open class C {
    open fun D.foo() {
        println("D C")
    }
    open fun D1.foo() { //無法覆寫 D C
        println("D1 C")
    }
    fun caller(d:D) {
        d.foo()
    }
}
open class C1:C() {
    override fun D.foo() { //覆寫 D C !!!
        println("D C1")
    }
    override fun D1.foo() { //無法覆寫 D C1
        println("D1 C1")
    }
}
fun main(args: Array<String>) {
    C().caller(D()) // D C
    C().caller(D1()) // D C
    C1().caller(D()) // D C1
    C1().caller(D1()) // D C1
}