public class Prime {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean primeFlag = true;
            for (int j = 2; j < i ;j++) {
                if ((i % j) == 0) {
                    primeFlag = false;
                    break;
                }
            }
            if (primeFlag) {
                System.out.println(i);
            }
        }
    }
}
