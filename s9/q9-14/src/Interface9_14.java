interface A {
    void a1();
    void a2();
}

interface B {
    void b1();
    void b2();
}

interface C {
    void c1();
    void c2();
}

interface Extend extends A, B, C {
    void end();
}

class Top {
    int i;

    void top() {
        System.out.println("Top.top()");
    }
}

class End extends Top implements Extend {
    @Override
    public void a1() {
        System.out.println("End.a1()");
    }

    @Override
    public void a2() {
        System.out.println("End.a2()");
    }

    @Override
    public void b1() {
        System.out.println("End.b1()");
    }

    @Override
    public void b2() {
        System.out.println("End.b2()");
    }

    @Override
    public void c1() {
        System.out.println("End.c1()");
    }

    @Override
    public void c2() {
        System.out.println("End.c2()");
    }

    @Override
    public void end() {
        System.out.println("End.end()");
    }
}
public class Interface9_14 {
    static void aFunc(A a) {
        a.a1();
    }

    static void bFunc(B b) {
        b.b2();
    }

    static void cFunc(C c) {
        c.c1();
    }

    static void extendFunc(Extend extend) {
        extend.end();
    }

    public static void main(String[] args) {
        End e = new End();
        aFunc(e);
        bFunc(e);
        cFunc(e);
        extendFunc(e);
    }
}
