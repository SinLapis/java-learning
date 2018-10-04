abstract class AbstractPrint {
    abstract void print();
    AbstractPrint() {
        print();
    }
}

class Print extends AbstractPrint {
    private int i = 5;
    @Override
    void print() {
        System.out.println(i);
    }
}
public class PrintTest {
    public static void main(String[] args) {
        Print p = new Print();
        p.print();
        // 抽象类被非抽象类继承后，其定义的构造函数可以正常使用。
    }
}
