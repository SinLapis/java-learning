class Alice {
    Alice(int i) {
        System.out.println("Alice" + i);
    }
}
class Bob {
    Bob(int i) {
        System.out.println("Bob" + i);
    }
}
class Chary extends Alice {
    Bob b;
    Chary(int i) {
        super(i);
        b = new Bob(i);
    }
}
public class Super {
    public static void main(String[] args) {
        new Chary(9);
    }
}
