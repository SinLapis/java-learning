public class BitOperation {
    public static void main(String[] args) {
        int a = 0xaaaaaa;
        int b = 0x555555;
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(~b));

    }
}
