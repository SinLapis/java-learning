class BaseClass {
    void baseFunc() {
        System.out.println("BaseClass.baseFunc()");
    }
    void upperFunc() {
        System.out.println("BaseClass.upperFunc()");
        baseFunc();
        System.out.println("upper end");

    }
}

class ExtendClass extends BaseClass {
    @Override
    void baseFunc() {
        System.out.println("ExtendClass.baseFunc()");
    }
}

public class Test {
    public static void test(BaseClass b) {
        b.upperFunc();
    }

    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        ExtendClass e = new ExtendClass();
        test(b);
        test(e);
    }
}
