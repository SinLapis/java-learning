public class PrintArgs {
    public static void main(String[] args) {
        try{
            System.out.print("0: " + args[0] + "\n1: " + args[1] + "\n2 :" + args[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("not enough args");
        }
    }
}
