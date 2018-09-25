import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random r = new Random();
        boolean result = r.nextBoolean();
        System.out.print(result);
    }
}
