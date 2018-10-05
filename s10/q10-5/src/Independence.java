class Outer {
    public class Inner {

    }
}
public class Independence {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Outer.Inner();
    }
}
