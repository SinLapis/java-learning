class Father {
    Father() {
        System.out.println("Father()");
    }
}
public class Son extends Father {
    public static void main(String[] args) {
        new Son();
    }
}
