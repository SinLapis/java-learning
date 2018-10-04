public class Shapes {
    private static RandomShapeGenerator r = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < 9; i++) {
            s[i] = r.next();
        }
        for(Shape shape: s) {
            shape.draw();
        }
    }
}
