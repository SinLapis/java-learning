enum Type {
    ONE, TWO, THREE
}
class Cycle {
    void ride(Type t) {
        System.out.println("Draw Cycle, " + t);
    }
}
class Unicycle extends Cycle{
    void ride(Type t) {
        System.out.println("Draw Unicycle, " + t);
    }
}
class Bicycle extends Cycle{
    void ride(Type t) {
        System.out.println("Draw Bicycle, " + t);
    }
}
class Tricycle extends Cycle{
    void ride(Type t) {
        System.out.println("Draw Tricycle, " + t);
    }
}
public class Draw {
    private static void play(Cycle c) {
        c.ride(Type.THREE);
    }
    public static void main(String[] args) {
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        Unicycle uc = new Unicycle();
        play(uc);
        play(tc);
        play(bc);
    }
}
