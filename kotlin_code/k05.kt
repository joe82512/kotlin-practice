package kotlin_code

/* 繼承 */
class k_inhert:k05_inhertitance() {
    fun kkk() {
        println("KKK")
    }
    final override fun kk() {
        //覆寫, 需要override; final代表無法再被覆寫 (多重繼承)
        super.kk() //取出原本的
        println("override")
    }
}
// 繼承 -> 介面 ; 繼承一次只能一組, 介面可以很多
class K_interface:kotlin_interface {
    override fun ki() { //無預設, 必須定義
        println("k~i")
    }
    override fun kii() { //有預設值, 可不用定義
        println("k~i~i")
    }
}

fun main(args: Array<String>) {
    /* 建構子 */
    k05_class("nhentai.net/g/", 31300)
    k05_class(31300)

    /* getter setter */
    var n = k05_getter_setter()
    println(n.name)
    n.name = "ABC"
    println(n.name)

    /* function */
    fun demo (i: Int = 1, s: String = "hello world", f: Float) {
        println(i.toString() + s + f.toString())
    }

    /* 繼承 */
    k_inhert().k()
    k_inhert().kk()
    k_inhert().kkk()

    /* 介面 */
    K_interface().ki()
    K_interface().kii()
}