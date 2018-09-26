public class Dog {
    private void bark(int i, String s) {
        System.out.println("barking");
    }
    private void bark(String s, int i) {
        System.out.println("howling");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1, "1");
        d.bark("1", 1);
    }
}
