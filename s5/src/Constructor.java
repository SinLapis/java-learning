public class Constructor {
    public int i;
    Constructor () {
        i = 4;
    }
    Constructor(int addon) {
        this();
        i += addon;
    }
    public static void main(String[] args) {
        Constructor c = new Constructor(2);
        System.out.println(c.i);
    }
}
