package package_b;

import package_a.InterfaceA;

public class ClassB {
    protected class InnerB implements InterfaceA {
        @Override
        public void funcA() {
            System.out.println("InnerB.funcA()");
        }
    }
    public InnerB getInnerB() {
        return new InnerB();
    }
}
