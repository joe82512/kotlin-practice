package kotlin_code

import kotlin.reflect.full.functions

/* 註釋 */
// 標記用, 不是實質指令, 主要提供訊息
// 但可以提供不同時期(編譯/運行...等)的訊息給反射
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS) //註釋設定: 限定註釋類/函數/屬性等
@Retention(AnnotationRetention.RUNTIME) //註釋設定:存在時期SOURCE/BINARY/RUNTIME,預設runtime
//@Retention(AnnotationRetention.SOURCE) //SOURCE代表僅存在於編譯期
annotation class AnnotationClass {} //製作註釋AnnotationClass
@AnnotationClass class DemoAnnotation { //註釋類別DemoAnnotation
    fun functionA():Int {
        println("functionA")
        return 1
    }
    fun functionB():Int? {
        println("functionB")
        return null
    }
}

/* 反射 */
// 調用(動態的)類或函數
// 可以像Java的靜態函數一樣不用實體化
// 須應用kotlin-reflect.jar, 但intelliJ預設
val reflect_class = DemoAnnotation::class //反射類別

fun main(args: Array<String>) {
    println(reflect_class.functions)
    println(reflect_class.functions.size)
    for (f in reflect_class.functions){
        println(f.name + ":" + f.returnType)
    }
    println(reflect_class.annotations) //顯示註釋
}