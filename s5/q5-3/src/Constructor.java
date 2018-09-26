public class Constructor {
    public String s;
    Constructor() {
        s = "hello";
        System.out.println("complete constructing");
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
