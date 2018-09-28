enum Money {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
public class MoneyEnum {
    public static void main(String... args) {
        for(Money m: Money.values()) {
            System.out.println(m + ": " + m.ordinal());
        }
    }
}
