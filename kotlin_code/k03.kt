package kotlin_code //declare path
import folder_path.sub_path.square //import package
import folder_path.sub_path.square as k03p //rename
/* function */
fun main(args: Array<String>) {
    val i: Int = 1
    val j = 10 //default type
    println(divided(i.toDouble(),j)) //must turn i type
    println(divided2(i,j)) //output 0
    multiply(i,j)

    //import
    val k = 5.0 //default type
    //println(folder_path.sub_path.k03_package.square(k))
    println(square(k))
    println(k03p(k)) //rename
    println(folder_path.sub_path.j03_package.square(k)) //compatible with Java
}

/* function structure */
fun divided(m: Double, n: Int): Double { //turn type here
    return m / n //return double
}
fun divided2(m: Int, n: Int): Double {
    return (m / n).toDouble() //turn type here
}
fun multiply(m: Int, n: Int): Unit { //unit can ignore
    println(m * n) //not return
}
/*
* 修飾詞
* 預設: 同class或同package下可用
* public: 完全公開
* private: 僅同class下能用
* protected: 同class或同package下可用, 繼承的class也可用
*
* static: 靜態, 程式一開始就載入, 故使用時不用寫在main內, 也不一定要實體化成物件, 且從不同物件調用的值為同一個
* abstract: 抽象, 無法實體化成物件
* final: 固定, 無法被改變與繼承
*/