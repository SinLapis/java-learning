public class AnotherName {
    public static void main(String[] args) {
        TestFloat t1 = new TestFloat();
        TestFloat t2 = t1;
        t2.f += 3.4F;
        System.out.print(t1.f);
    }
}
