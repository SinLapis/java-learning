import java.util.Random;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play(): " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument.");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play(): " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play(): " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion.");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play(): " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed.");
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play(): " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class WoodWind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("WoodWind.play(): " + n);
    }

    @Override
    public String toString() {
        return "WoodWind";
    }
}

class Piano extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Piane.play(): " + n);
    }

    @Override
    public String toString() {
        return "Piano";
    }

}

class InstrumentFactory {
    private Random r = new Random(47);
    public Instrument next() {
        switch (r.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new WoodWind();
            case 4: return new Brass();
            case 5: return new Piano();
        }
    }
}
public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] is) {
        for (Instrument i: is) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        InstrumentFactory instrumentFactory = new InstrumentFactory();
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < 10; i++) {
            orchestra[i] = instrumentFactory.next();
        }
//        tuneAll(orchestra);
        for (Instrument i: orchestra) {
            System.out.println(i.toString());
        }
    }
}
