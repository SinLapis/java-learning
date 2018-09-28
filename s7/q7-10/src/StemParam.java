class Component1 {
    Component1(int i) {
        System.out.println(i + "c1");
    }
}
class Component2 {
    Component2(int i) {
        System.out.println(i + "c2");
    }
}
class Component3 {
    Component3(int i) {
        System.out.println(i + "c3");
    }
}
class Root {
    Component1 rc1 = new Component1(4);
    Component2 rc2 = new Component2(5);
    Component3 rc3 = new Component3(6);
    Root(int i) {
        System.out.println(i + "r");
    }
}
public class StemParam extends Root{
    Component1 sc1 = new Component1(4);
    Component2 sc2 = new Component2(5);
    Component3 sc3 = new Component3(6);
    StemParam(int i) {
        super(i);
        System.out.println((i + 1) + "s");
    }
    public static void main(String[] args) {
        new StemParam(5);
    }
}
