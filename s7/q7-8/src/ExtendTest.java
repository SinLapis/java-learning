class Base {
    Base(int i) {
        System.out.println("base: " + i);
    }
}
public class ExtendTest extends Base{
    ExtendTest() {
        super(0);
    }
    ExtendTest(int i) {
        super(i);
    }
    public static void main(String[] args) {
        new ExtendTest();
        new ExtendTest(2);
    }
}
