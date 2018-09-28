class Component1 {
    Component1() {
        System.out.println("c1");
    }
}
class Component2 {
    Component2() {
        System.out.println("c2");
    }
}
class Component3 {
    Component3() {
        System.out.println("c3");
    }
}
class Root {
    Component1 rc1 = new Component1();
    Component2 rc2 = new Component2();
    Component3 rc3 = new Component3();
    Root() {
        System.out.println("r");
    }
}
public class Stem extends Root{
    Component1 sc1 = new Component1();
    Component2 sc2 = new Component2();
    Component3 sc3 = new Component3();
    Stem() {
        System.out.println("s");
    }
    public static void main(String[] args) {
        new Stem();
    }
}
