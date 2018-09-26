import java.util.stream.IntStream;

public class Numbers2 {
    public static void main(String[] args) {
        for(int i: IntStream.rangeClosed(0, 101).toArray()) {
            if (i <= 99) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
