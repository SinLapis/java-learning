package outer;
import inter.Print;

public class PrintClass implements Print {
    @Override
    public void printInt() {
        System.out.println(1);
    }

    @Override
    public void printString() {
        System.out.println("String");
    }

    @Override
    public void printFloat() {
        System.out.println(1.2f);
    }
}
