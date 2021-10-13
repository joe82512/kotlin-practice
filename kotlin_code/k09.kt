package kotlin_code
/*
* 泛型 : 資料結構的多型
*/
// 類別
class Box<T>(value:T) {
    var value:T = value //未定義型態
}

// 函數
fun <T>gift(value:T) {
    println(value)
}

// 泛型約束: 限制型態的上限
// 可以用子類定義, 且可以多個約束
open class BoxParent {
    open fun p() {
        println("Parent")
    }
}
class BoxChild:BoxParent() {
    override fun p() {
        println("Child")
    }
}
fun gift_class(value:BoxParent):BoxParent {
    var value:BoxParent = value
    println(value)
    return value
}
fun <T:BoxParent>gift_limit(value:T):T {
    var value:T = value
    println(value)
    return value
}

// In/Out 限制讀寫
class BoxIn<in T>(value:T) { //唯寫入
    fun p(value:T) {
        println("BoxIn")
        println(value)
    }
    fun p2(value:T):Int { //輸出不能為T,T被限制只能寫入
        println("BoxIn")
        return 10
    }
}
class BoxOut<out T>(value:T) { //唯讀
    val value:T = value //必須用val
    fun p(): T {
        println("BoxOut")
        return value
    }
}

// 類型投射 (常用情境: 複合類別)
/*
* Any 與 Int 為父子類, Array為泛型 Array<T>
* Array<Any> 與 Array<Int> 不為父子類
* 將 Any改為out Any, 就能允許子類的Array (Array<Int>)
*/
fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
    println(to[1])
}
/* 反過來說,定義Array<in String>就可以允許父類 Array (Array<Any>) */
fun copy2(from: Array<Any>, to: Array<in String>) {
    for (i in from.indices) {
        to[i] = from[i].toString()
    }
    println(to[1])
}
/* 星號投射, 代表 <in Nothing>且<out Any?> */
fun copy3(from: Array<*>, to: Array<Any?>) { // ?代表允許null
    for (i in from.indices) {
        to[i] = from[i]
    }
    println(to[1])
}

fun main(args: Array<String>) {
    //泛型類別
    var box1:Box<Int> = Box(100) //資料型態
    var box2:Box<String> = Box("box")

    //泛型函數
    gift("iphone")
    gift(13)

    //泛型約束1: 父子類物件建立
    var b1:BoxParent = BoxParent() //父類物件
    var b2:BoxChild = BoxChild() //子類物件
    //泛型約束2: 指定"類別"為父類
    var bc1:BoxParent = gift_class(b1) //BoxParent
    println(bc1 is BoxChild) //false
    var bc2:BoxParent = gift_class(b2) //容許子類 BoxChild
    println(bc2 is BoxChild) //true
    // var bc3:BoxChild = gift_class(b2) //無法定為子類, 與約束最大差異
    //泛型約束3: 限制"泛型"為父類
    var box4:BoxParent = gift_limit(b1) //BoxParent
    println(box4 is BoxChild) //false
    var box5:BoxParent = gift_limit(b2) //容許子類 BoxChild
    println(box5 is BoxChild) //true
    var box6:BoxChild = gift_limit(b2) //BoxChild
    println(box6 is BoxChild) //true

    // In
    var bin = BoxIn("box")
    bin.p("box p")
    bin.p2("box p2")
    // Out
    var bout = BoxOut("box")
    println(bout.p())

    //類型投射
    var a0: Array<Int> = arrayOf(1,2,3)
    var a1: Array<Any> = arrayOf(1,2,3)
    var a2: Array<Any> = arrayOf("A","B","C")
    copy(a0, a2)
    copy2(a1, a2)

    //星號投射
    var a3: Array<Any?> = arrayOf("A","B","C")
    copy3(a0, a3)
    copy3(a1, a3)
}