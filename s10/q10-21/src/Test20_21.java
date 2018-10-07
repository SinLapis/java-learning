interface A {
    void print();
    class B {
        public static void print(A a) {
            a.print();
        }
    }
}

class C implements A{

    @Override
    public void print() {
        System.out.println("C.print()");
    }
}
public class Test20_21 {
    public static void main(String[] args) {
        C c = new C();
        A.B.print(c);
    }
}
