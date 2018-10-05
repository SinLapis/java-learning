package package_c;

import package_a.InterfaceA;
import package_b.ClassB;

public class ClassC extends ClassB {
    ClassB classB = new ClassB();
    InterfaceA getA() {
        return classB.getInnerB();
    }
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        classC.getA().funcA();
    }
}
