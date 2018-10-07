import java.io.FileWriter;

class FirstClass {
    class SecondClass {
        class ThirdClass {
            void print() {
                System.out.println("ThirdClass.print()");
            }
        }
    }
}
public class Test10_19 {
    public static void main(String[] args) {
        FirstClass f = new FirstClass();
        FirstClass.SecondClass s = f.new SecondClass();
        FirstClass.SecondClass.ThirdClass t = s.new ThirdClass();
        t.print();
    }
}
