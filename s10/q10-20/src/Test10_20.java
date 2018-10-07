interface TestA {
    void print();
    class ClassBInA {
        void print() {
            System.out.println("ClassBInA.print()");
        }
    }
}

class ClassC implements TestA {
    @Override
    public void print() {
        System.out.println("ClassC.print()");
    }
    ClassBInA getClassBInA() {
        return new ClassBInA();
    }
}
public class Test10_20 {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        TestA.ClassBInA b = c.getClassBInA();
        b.print();
    }
}
