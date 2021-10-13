package java_code;

public class j06 {
    /* enum 列舉 */
    enum Enum1 { //無值列舉
        a, b, c, d
    }
    enum Enum2 { //有值列舉
        a(1), b(2), c(3), d(4);
        private int value;
        private Enum2 (int value) { //不能為public
            this.value = value;
        }
        public int get_Value() {
            return value;
        }
    }
    public static void main(String[] args) {
        Enum1 e1 = Enum1.c;
        System.out.println(e1);
        Enum2 e2 = Enum2.c;
        System.out.println(e2.get_Value());
        System.out.println(e2.value); //內建
        // 讀取預設值: name 與 ordinal
        System.out.println(e1.name());
        System.out.println(e1.ordinal());
        System.out.println(e2.name());
        System.out.println(e2.ordinal());
    }
}
