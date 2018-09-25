import java.util.Random;

public class RandomCompare {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int k = random.nextInt();
            int kNext = random.nextInt();
            if (k > kNext) {
                System.out.println("No." + i + ": larger");
            } else if (k < kNext) {
                System.out.println("No." + i + ": smaller");
            } else {
                System.out.println("No." + i + ": same");
            }
        }
    }
}
