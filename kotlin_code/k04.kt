/* logic control */
fun main(args: Array<String>) {
    val x = 10
    val y = 10.0
    /* if else */
    if (x.toDouble() == y) {
        println("True")
    } else if (x.toDouble() != y) {
        println("False")
    } else {
        println("Impossible")
    }

    /* switch */
    when (x) {
        1 -> {
            println(1) //without break
        }
        10 -> println(10) //single command
        else -> println("unknown") //default
    }

    /* for loop */
    val forList: MutableList<Int> = ArrayList() //without import
    for (i in 0 .. 10 step 2) { //or 0 until 11 step 2
        forList.add(i)
        println(i)
    }
    println(forList)

    /* while loop */
    var j = 0
    while (j < 20) {
        if (forList[j] == 8) {
            break
        }
        j++
        if (j == 2) {
            continue
        }
        println(j)
    }

    /* do while */
    var k = 50
    do {
        println(k)
        k = k + 10
    } while (k <= 100)
}
/*
* enum (列舉型態):
* 可定義物件編號的型態,
* 編號可用 byte、int、long...etc,
* 且佔用記憶體少, 常用於判斷狀態.
*/