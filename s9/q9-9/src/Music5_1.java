enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}
abstract class Instrument {
    abstract void play(Note n);
    abstract void adjust();
}
class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed extends Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind {
    @Override
    public String toString() {
        return "WoodWind";
    }
}
public class Music5_1 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i: e) {
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
        tuneAll(orchestra);
    }
}