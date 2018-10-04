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
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
//        tuneAll(orchestra);
        for (Instrument i: orchestra) {
            System.out.println(i.toString());
        }
    }
}
