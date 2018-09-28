class Alice {
    Alice() {
        System.out.println("Alice");
    }
}
class Bob {
    Bob() {
        System.out.println("Bob");
    }
}
class Chary extends Alice {
    Bob b = new Bob();
}
public class Triangle {
    public static void main(String[] args) {
        new Chary();
    }
}
