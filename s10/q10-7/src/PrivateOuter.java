class Outer {
    private int i = 5;
    private void privatePrint() {
        System.out.println("Outer.privatePrint()");
    }
    public class Inner {
        public void setOuterI(int i) {
            Outer.this.i = i;
        }
        public int getOuterI() {
            return Outer.this.i;
        }
        public void runPrint() {
            privatePrint();
        }
    }
    public void run() {
        Inner inner = new Inner();
        inner.setOuterI(7);
        System.out.println(inner.getOuterI());
        inner.runPrint();
    }
}
public class PrivateOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.run();
    }
}
