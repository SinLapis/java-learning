public class ArrayTest {
    ArrayTest(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        ArrayTest[] a;
        a = new ArrayTest[]{new ArrayTest("abc"), new ArrayTest("haha")};
    }
}
