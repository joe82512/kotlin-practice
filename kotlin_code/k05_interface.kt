package kotlin_code

interface kotlin_interface { //預設 open
    fun ki () //函數預設 open; 但無預設值, 必須定義
    fun kii () { //函數預設 open
        println("kii") //有預設值, 可不用定義
    }
}