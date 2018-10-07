interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {}
    @Override
    public void move() {
        System.out.println("Unicycle move.");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    private Bicycle() {}
    @Override
    public void move() {
        System.out.println("Bicycle move.");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    private Tricycle() {}
    @Override
    public void move() {
        System.out.println("Tricycle move.");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class CycleTest {
    public static void moveCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.move();
    }

    public static void main(String[] args) {
        moveCycle(Tricycle.factory);
    }
}
