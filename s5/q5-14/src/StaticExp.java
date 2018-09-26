class Test {
    static String s1 = "define";
    static String s2;
    static {
        s2 = "static block";
    }
    static void printParam() {
        System.out.println(s1);
        System.out.println(s2);
    }
}
public class StaticExp {
    public static void main(String[] args) {
        Test.printParam();
    }
}
