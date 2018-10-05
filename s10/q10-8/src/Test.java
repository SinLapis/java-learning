public class Test {
    class Inner {
        private int i = 9;
    }
    public int getI() {
        Inner inner = new Inner();
        return inner.i;//可以访问内部类private成员
    }
}
