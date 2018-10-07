public class TestStatic10_19 {
    static class FirstClass {
        static class SecondClass {
            static class ThirdClass {
                void print() {
                    System.out.println("static ThirdClass.print()");
                }
            }
        }
    }
    public static void main(String[] args) {
        FirstClass.SecondClass.ThirdClass t = new FirstClass.SecondClass.ThirdClass();
        t.print();
    }
}
