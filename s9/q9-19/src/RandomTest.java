import sun.security.x509.RFC822Name;

import java.util.Random;

class RandomTool {
    protected Random r = new Random();
    int next(){return 0;}
}

class Coin extends RandomTool {
    @Override
    public int next() {
        return r.nextInt(2);
    }
}

class Dice extends RandomTool {
    @Override
    public int next() {
        return r.nextInt(6) + 1;
    }
}
class RandomToolFactory {
    RandomTool getRandomTool(int type) {
        switch (type) {
            case 0: default: return new Coin();
            case 1: return new Dice();
        }
    }
}

public class RandomTest {
    public static void main(String[] args) {
        RandomToolFactory randomToolFactory = new RandomToolFactory();
        System.out.println(randomToolFactory.getRandomTool(1).next());
        System.out.println(randomToolFactory.getRandomTool(0).next());
    }
}
