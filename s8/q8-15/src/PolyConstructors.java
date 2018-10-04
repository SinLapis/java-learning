import javax.swing.plaf.synth.SynthTextAreaUI;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("before draw");
        draw();
        System.out.println("after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
