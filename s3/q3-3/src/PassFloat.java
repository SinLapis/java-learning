public class PassFloat {
    static void changeFloat(TestFloat y){
        y.f += 1.1F;
    }
    public static void main(String[] args) {
        TestFloat t = new TestFloat();
        t.f = 2.2F;
        System.out.println(t.f);
        changeFloat(t);
        System.out.println(t.f);
    }
}
