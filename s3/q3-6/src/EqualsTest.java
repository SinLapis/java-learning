public class EqualsTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        Dog spotCopy = spot;
        System.out.println("==: " + (spot == spotCopy));
        System.out.println("equals: " + spot.equals(spotCopy));
        //比较内容是引用
    }
}
