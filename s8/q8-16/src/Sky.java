class Starship {
    void move() {
        System.out.println("moving.");
    }
}

class FastStarship extends Starship {
    void move() {
        System.out.println("moving fast.");
    }
}

class NormalStarship extends Starship {
    void move() {
        System.out.println("moving normal.");
    }
}

class SlowStarship extends Starship {
    void move() {
        System.out.println("moving slow.");
    }
}

class Universe {
    private Starship starship = new NormalStarship();
    void change(int i) {
        switch (i) {
            case 0:
                starship = new SlowStarship();
                break;
            case 1:
                starship = new NormalStarship();
                break;
            case 2:
                starship = new FastStarship();
                break;
                default:
                    break;
        }
    }
    void move() {
        starship.move();
    }
}
public class Sky {
    public static void main(String[] args) {
        Universe u = new Universe();
        u.move();
        u.change(2);
        u.move();
        u.change(0);
        u.move();
        u.change(1);
        u.move();
        u.change(3);
        u.move();
    }
}
