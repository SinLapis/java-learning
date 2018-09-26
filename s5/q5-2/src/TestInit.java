public class TestInit {
    public static void main(String[] args) {
        Defined d;
        Construct c;
        d = new Defined();
        c = new Construct();
        System.out.println("after init: " + d.s + ", " + c.s);
    }
}
