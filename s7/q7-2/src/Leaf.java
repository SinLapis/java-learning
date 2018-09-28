class Detergent {
    protected String s = "a";
    public void scrub() {
        System.out.println(s);
    }
}
public class Leaf extends Detergent{
    public void scrub() {
        System.out.println(s + "hh");
    }
    public void sterilize() {
        System.out.println("new");
    }
    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.scrub();
        l.sterilize();
    }
}
