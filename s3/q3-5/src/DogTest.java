public class DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";
        System.out.println("name: " + spot.name + "\tsays: " + spot.says);
        System.out.println("name: " + scruffy.name + "\tsays: " + scruffy.says);
    }
}
