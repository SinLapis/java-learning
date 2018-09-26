public class Fibonacci {
    public static void main(String[] args) {
        int end;
        end = Integer.parseInt(args[0]);
        int a = 1, b = 1;
        for (int i = 0; i < end; i++) {
            if (i < 2) {
                System.out.println(1);
            } else {
                b = a + b;
                a = b - a;
                System.out.println(b);
            }
        }
    }
}
