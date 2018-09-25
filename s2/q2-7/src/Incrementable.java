public class Incrementable {
    private static void increment() {
        StaticTest.i ++;
    }
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.print(StaticTest.i);
    }
}
