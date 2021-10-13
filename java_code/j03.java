package java_code; //declare path
import folder_path.sub_path.j03_package; //import package
public class j03 {
    /* function */
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        System.out.println(divided(i,j)); //auto turn i type
        System.out.println(divided2(i,j)); //output 0
        multiply(i,j);

        //import
        double k = 5;
        System.out.println(folder_path.sub_path.j03_package.square(k));
        System.out.println(j03_package.square(k));
    }

    /* function structure */
    public static double divided (double m, int n) { //turn type here
        return m/n; //return double
    }
    public static double divided2 (int m, int n) {
        return m/n; //turn type here
    }
    public static void multiply (int m, int n) {
        System.out.println(m*n); //not return
    }
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