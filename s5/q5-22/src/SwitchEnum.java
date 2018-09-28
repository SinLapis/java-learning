enum Money {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
public class SwitchEnum {
    public static void main(String... args) {
        for (Money m: Money.values()) {
            switch (m) {
                case ONE:
                    System.out.println("$1");
                    break;
                case TEN:
                    System.out.println("$10");
                    break;
                case FIVE:
                    System.out.println("$5");
                    break;
                case FIFTY:
                    System.out.println("$50");
                    break;
                case TWENTY:
                    System.out.println("$20");
                    break;
                case HUNDRED:
                    System.out.println("$100");
            }
        }
    }
}
