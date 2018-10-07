class TestA {
    protected int i;
    TestA(int i) {
        this.i = i;
        System.out.println(i);
    }
    void print() {
        System.out.println("TestA.print()");
    }
}

class TestB {
    TestA getTestA(int i) {
        return new TestA(i){
            void print() {
                System.out.println("Anonymous.print()");
            }
        };
    }
}
public class Test10_15 {
    public static void main(String[] args) {
        TestB b = new TestB();
        b.getTestA(5).print();
    }
}
