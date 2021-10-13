package kotlin_code
/* 集合 */
// 常用集合: listOf, setOf, mapOf
// 常用可變集合: mutableListOf, mutableSetOf, mutableMapOf
// 但mutable沒有預設out泛型

/* 序列 */
// 即有序集合, 等同用 for loop + mutableListOf
// IntProgression
// LongProgression
// CharProgression

/* 相關函數 */
// rangeTo 正向疊代
// downTo 反向疊代
// reversed 反轉數列
// step 間隔

fun main(args: Array<String>) {
    // Mutable
    val varnumlist: MutableList<Int> = mutableListOf(1,2,3) //val
    var numlist: List<Int> = varnumlist.toList() //var
    var numlist2: List<Int> = varnumlist //自動轉換, 值隨原本變動; 不可逆轉
    varnumlist.add(4) //val可以用函數修改
    println(varnumlist)
    numlist = listOf(1,2,3,4,5)
    println(numlist) //直接替換變數值
    println(numlist2) //值隨原本變動

    // out泛型
    var list1:List<Int> = listOf(1,2)
    var list2:List<Any> = listOf()
    var mutablelist1:MutableList<Int> = mutableListOf(1,2)
    var mutablelist2:MutableList<Any> = mutableListOf()
    var mutablelist3:MutableList<out Any> = mutableListOf()
    list2 = list1
    println(list2)
    //mutablelist2 = mutablelist1 //無out,失敗
    mutablelist3 = mutablelist1
    println(mutablelist3)

    // 序列
    var seq = IntProgression.fromClosedRange(0, 20, 2)
    for (s in seq) {
        println(s)
    }
}