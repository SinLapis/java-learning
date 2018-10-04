class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Line.erase()");
    }
}
public class Shapes {
    private static RandomShapeGenerator r = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        for (int i = 0; i < 9; i++) {
            s[i] = r.next();
        }
        s[9] = new Line();
        for(Shape shape: s) {
            shape.draw();
        }
    }
}
