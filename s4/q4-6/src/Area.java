public class Area {
    private static String inArea(int testval, int begin, int end) {
        if (begin > end) {
            return "Area Error!";
        } else {
            if (testval >= begin && testval <= end) {
                return "True";
            } else {
                return "False";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(inArea(3, 2, 5));
        System.out.println(inArea(6, 7, 9));
        System.out.println(inArea(1, 3, 1));
    }
}
