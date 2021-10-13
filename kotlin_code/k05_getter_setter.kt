package kotlin_code

class k05_getter_setter {
    /* getter setter */
    var name: String = "null" //不能封裝, 須要初始值
    get() = field //field 為 kotlin 保留字, 也可以宣告另一變數 name2 替代
    set (name) {
        field = name
    }
}