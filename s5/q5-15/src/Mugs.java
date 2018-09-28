class Mug {
    String s;
    Mug() {
        s = "white";
        System.out.println("()");
    }
    Mug(String color) {
        s = color;
        System.out.println("(String)");
    }
}
public class Mugs {
    Mug m1;
    Mug m2;
    {
        m1 = new Mug();
        m2 = new Mug("blue");
    }
    public static void main(String[] args) {
        new Mugs();
    }
}
