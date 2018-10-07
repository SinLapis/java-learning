class NormalClass {
    public static class TestStaticClass {
        void print() {
            System.out.println("TestStaticClass.print()");
        }
    }
}
public class Test10_18 {
    public static void main(String[] args) {
        NormalClass.TestStaticClass t = new NormalClass.TestStaticClass();
        t.print();
    }
}
