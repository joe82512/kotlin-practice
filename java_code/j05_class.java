package java_code;

class j05_class {
    /* 建構子 */
    public j05_class(String url) {
        System.out.println("網域:" + url.substring(0,8));
    }
    public j05_class(String net, int value) { //多載overload
        System.out.println(net+value);
    }
    public j05_class(int value) { //多載overload
        System.out.println("404 not found");
    }
}
