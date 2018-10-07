import java.util.ArrayList;

class Gerbil {
    int gerbilNumber;
    Gerbil(int i) {
        gerbilNumber = i;
    }
    void hop() {
        System.out.println("Gerbil " + gerbilNumber + " is hopping.");
    }
}
public class Test11_1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Gerbil(i));
        }
        for (Gerbil gerbil: arrayList) {
            gerbil.hop();
        }
    }
}
