public class DataOnly {
    int i;
    double d;
    boolean b;
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.print("i: " + data.i + "\nd: " + data.d  + "\nb: " + data.b);
    }
}
