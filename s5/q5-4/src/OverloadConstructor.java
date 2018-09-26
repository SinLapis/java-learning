public class OverloadConstructor {
    private String s;
    OverloadConstructor() {
        s = "default";
        System.out.println("constructor");
    }
    OverloadConstructor(String s) {
        System.out.println(s);
        System.out.println("overload constructor");
    }
    public static void main(String[] args) {
        OverloadConstructor o = new OverloadConstructor();
        OverloadConstructor over = new OverloadConstructor("hello");
    }
}
