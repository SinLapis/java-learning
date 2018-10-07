import javax.swing.text.rtf.RTFEditorKit;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

class RandomTool {
    protected Random r = new Random();
    int next(){return 0;}
}

interface RandomToolFactory {
    RandomTool getRandomTool();
}

class Coin extends RandomTool {
    private Coin() {}
    @Override
    public int next() {
        return r.nextInt(2);
    }
    public static RandomToolFactory factory = new RandomToolFactory() {
        @Override
        public RandomTool getRandomTool() {
            return new Coin();
        }
    };
}

class Dice extends RandomTool {
    private Dice() {};
    @Override
    public int next() {
        return r.nextInt(6) + 1;
    }
    public static RandomToolFactory factory = new RandomToolFactory() {
        @Override
        public RandomTool getRandomTool() {
            return new Dice();
        }
    };
}

public class RandomTest {
    public static void main(String[] args) {
        System.out.println(Coin.factory.getRandomTool().next());
        System.out.println(Dice.factory.getRandomTool().next());
    }
}
