package kotlin_code
/* 物件: 可以取代static */
// 建立物件: 指定或匿名
object NewObject { //繼承自Any
    var value:String = "靜態成員"
}

// 匿名宣告
private fun noname() = object {
    var value:String = "匿名宣告"
}

// 匿名物件: 繼承
open class ObjectClass(value:String) { //匿名物件使用繼承,需要open
    var value = value
    fun p() {
        println(value)
    }
}
fun object_function(value:ObjectClass) {
    value.p() //輸出字串
}

// 伴隨物件: 製造靜態成員
class CompanionObjectClass {
    var value = "非靜態成員"
    companion object{
        var value = "靜態成員"
    }
}

fun main(args: Array<String>) {
    // 指定物件
    var empty_object = NewObject //指定物件
    println(empty_object.value)
    // 匿名物件: 類似static
    println(NewObject.value)
    // 匿名宣告
    var x = noname()
    println(x.value)
    // 匿名物件: 繼承類別或介面
    object_function(object: ObjectClass("匿名物件"){})
    // 伴隨物件
    var y = CompanionObjectClass() //實體化
    println(y.value)
    //直接取用靜態成員, 但kotlin底層其實有實體化
    println(CompanionObjectClass.value)
}