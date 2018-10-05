class Outer {
    private class Inner implements OuterInterface{

        @Override
        public void print() {
            System.out.println("Inner.print()");
        }
    }
    public OuterInterface getInner() {
        return new Inner();
    }
}
public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getInner().print();
        //! ((Outer.Inner)outer.getInner()).print();
    }

}
