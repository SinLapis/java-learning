public class Switch {
    private void withBreak() {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 2:
                    System.out.println("Yeah, it's 2.");
                    break;
                case 4:
                    System.out.println("4 is bad.");
                    break;
                case 1:
                    System.out.println("I'm 1st.");
                    break;
                case 0:
                    System.out.println("Nothing.");
                    break;
                case 3:
                    System.out.println("Threeeeeeen!");
                    break;
            }
        }
    }
    private void withoutBreak() {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 2:
                    System.out.println("Yeah, it's 2.");
                case 4:
                    System.out.println("4 is bad.");
                case 1:
                    System.out.println("I'm 1st.");
                case 0:
                    System.out.println("Nothing.");
                case 3:
                    System.out.println("Threeeeeeen!");
            }
        }
    }
    public static void main(String[] args) {
        Switch s = new Switch();
        s.withBreak();
        s.withoutBreak();
    }
}
