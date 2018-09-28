class Base {
    void test(int i) {
        System.out.println("int func");
    }
    void test(float f) {
        System.out.println("float func");
    }
    void test(String s) {
        System.out.println("string func");
    }
}
class Extend extends Base {
    void test() {
        System.out.println("extend func");
    }
}
public class Override {
    public static void main(String[] args) {
        Extend e = new Extend();
        e.test();
        e.test(2);
        e.test(0.2f);
        e.test("edc");
    }
}
