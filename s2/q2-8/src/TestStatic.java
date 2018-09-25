public class TestStatic {
    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        System.out.println(s1.i);
        s2.i++;
        System.out.println(s1.i);
    }
}
