package java_code;

public class j05 {
    /* 繼承 */
    public static class j_inhert extends j05_inheritance { //外部類別 static
        public void jjj() {
            System.out.println("jjj");
        }
        final public void jj() {
            //覆寫, 需要override; final代表無法再被覆寫 (多重繼承)
            super.jj(); //取出原本的
            System.out.println("override");
        }
    }
    // 繼承 -> 介面 ; 繼承一次只能一組, 介面可以很多
    public static class j_interface implements j05_interface { //外部類別 static
        public void ji() {
            System.out.println("j~i");
        }
    }

    public static void main(String[] args) {
        /* 建構子 */
        new j05_class("nhentai.net/g/", 31300);
        new j05_class(31300);

        /* getter setter */
        j05_getter_setter n =  new j05_getter_setter();
        System.out.println(n.getName());
        n.setName("ABC");
        System.out.println(n.getName());

        /* function */
        // java 沒有函數

        /* 繼承 */
        j_inhert j123 = new j_inhert(); //建立物件
        j123.j();
        j123.jj();
        j123.jjj();

        /* 介面 */
        j_interface j456 = new j_interface(); //建立物件
        j456.ji();
    }
}
