import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomCharacter {
    private static Random r = new Random(47);
    private static char[] chars =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    private int bound;

    public RandomCharacter(int bound) {
        this.bound = bound;
    }

    public char[] next() {
        char[] result = new char[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = chars[r.nextInt(chars.length)];
        }
        return result;
    }
}

public class AdaptedRandomCharacter extends RandomCharacter implements Readable{
    private int bound;
    private int count;
    public AdaptedRandomCharacter(int bound, int count) {
        super(bound);
        this.bound = bound;
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count > 0) {
            count--;
        } else {
            return -1;
        }
        if (bound < 0) {
            return -1;
        }
        char[] result = this.next();
        for(char c: result) {
            cb.append(c);
        }
        cb.append('\n');
        return result.length;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomCharacter(10, 5));
        while(s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
