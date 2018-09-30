import java.util.Random;

class Amphibian {
    protected void print() {
        System.out.println("test");
    }
    public static void change(Amphibian a) {
        System.out.println("ok");
    }
}
public class Frog extends Amphibian{
    public static void main(String[] args) {
        Frog f = new Frog();
        f.print();
        Amphibian.change(f);
    }
}
