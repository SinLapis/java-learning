public class LongTest {
    public static void main(String[] args) {
        long hex = 0xff67ff;
        long oct = 0763352;
        System.out.println(hex);
        System.out.println("hex: " + Long.toBinaryString(hex));
        System.out.println(oct);
        System.out.println("oct: " + Long.toBinaryString(oct));
    }
}
