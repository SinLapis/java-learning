public class Outer {
    private class Inner {

    }
    Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
    }
}
