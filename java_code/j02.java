public class j02 {
    /* variable */
    public static void main(String[] args) {
        int i = 10;
        double j = 0.1;
        final float k = 3.14159f; //const
        System.out.println(i+"/"+j+"/"+k);
        int ii ; //must initial
        //System.out.println(ii);
        ii = 11;
        System.out.println(ii);
        //iii = 10; //error

        /* string */
        char c = 'c'; //character
        //System.out.println(c instanceof char); //not object
        String s = "string"; //string
        System.out.println(s instanceof String); //object
        /*
        basic: byte, short, int, long, float, double, boolean, char
        object: String, Arrays, Classes
        */

        /* boolean */
        boolean t = true;
        boolean f = false;

        /* array */
        int[] a = {1,2,3,4};
        int[] a0 = new int[10]; //zero array
        System.out.println(a0[0]);
        Integer[] an = new Integer[10]; //empty array
        System.out.println(an[0]);
    }
}
