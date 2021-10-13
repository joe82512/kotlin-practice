package java_code;
/* P7-6 */
class MyClass {
    public void test(){}
}

public class j11 {
    public static void process(MyClass obj){
        obj.test();
    }
    public static void main (String[] args){
        int n = 20;
        process(new MyClass(){
            public void test() {
                if (n==20){
                    System.out.println("Y");
                }
                else {
                    System.out.println("N");
                }
            }
        });
    }
}
