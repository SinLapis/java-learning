public class Outer {
    private String s;
    Outer() {
        s = "test";
    }
    private class Inner {
        public void print() {
            System.out.println(s);
        }
    }
    Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
        inner.print();
    }
}
