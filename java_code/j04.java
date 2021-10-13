import java.util.ArrayList; //variable length array
import java.util.List;

public class j04 {
    /* logic control */
    public static void main(String[] args) {
        int x = 10;
        double y = 10.0;
        /* if else */
        if (x == y) {
            System.out.println("True");
        }
        else if (x != y){
            System.out.println("False");
        }
        else {
            System.out.println("Impossible");
        }

        /* switch */
        switch (x) {
            case 1:
                System.out.println(1);
                break; //can't ignore break
            case 10:
                System.out.println(10);
                break;
            default:
                System.out.println("unknown");
        }

        /* for loop */
        List<Integer> forList = new ArrayList<Integer>(); //must import java.util
        for (int i=0; i<=10; i+=2) {
            forList.add(i);
            System.out.println(i);
        }
        System.out.println(forList);

        /* while loop */
        int j = 0;
        while (j<20) {
            if (forList.get(j)==8) {
                break;
            }
            j++;
            if (j==2) {
                continue;
            }
            System.out.println(j);
        }

        /* do while */
        int k = 50;
        do {
            System.out.println(k);
            k = k + 10;
        }
        while ( k <= 100 );
    }
}
/*
* enum (列舉型態):
* 可定義物件編號的型態,
* 編號可用 byte、int、long...etc,
* 且佔用記憶體少, 常用於判斷狀態.
*/
