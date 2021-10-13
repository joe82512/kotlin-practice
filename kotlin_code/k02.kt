/* variable */
fun main(args: Array<String>) {
    var i : Int = 10
    var j : Double = 0.1
    val k : Float = 3.14159f //const
    println("$i/$j/$k")
    var ii : Int //must initial
    //println(ii)
    ii = 11
    println(ii)
    var iii = 10 //correct
    println(iii)

    /* string */
    val c : Char = 'c' //character
    println(c is Char) //object
    val s : String = "string" //string
    println(s is String)
    /*
    object: numbers, booleans, characters, strings, arrays
    */

    /* boolean */
    val t : Boolean = true
    val f : Boolean = false

    /* array */
    val a = intArrayOf(1,2,3,4)
    val a0 = IntArray(10) //zero array
    println(a0[0])
    val an = arrayOfNulls<Int>(10) //empty array
    println(an[0])
    val ka  = arrayOf(true,"2",3,4.0) //generic
}