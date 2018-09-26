public class Dog {
    private void bark(int param1) {
        System.out.println("barking");
    }
    private void bark(String param2) {
        System.out.println("howling");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark("1");
    }
}
