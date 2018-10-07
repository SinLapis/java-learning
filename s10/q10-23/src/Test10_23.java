interface U {
    void ua();
    void ub(int i);
    void uc();
}

class A {
    U aa() {
        return new U() {
            @Override
            public void ua() {
                System.out.println("A.aa.ua()");
            }

            @Override
            public void ub(int i) {
                System.out.println("A.aa.ub() " + i);
            }

            @Override
            public void uc() {
                System.out.println("A.aa.uc()");
            }
        };
    }
}

class B {
    U[] us = new U[10];
    int i = 0;
    void append(U u) {
        if (i < 10 ) {
            us[i] = u;
            i++;
        }
    }
    void setNull(int i) {
        if (i >=0 && i < 10) {
            us[i] = null;
        }
    }
    void traverse() {
        for (int i = 0; i < 10; i++) {
            if (us[i] != null) {
                us[i].ub(i);
            }
        }
    }
}
public class Test10_23 {
    public static void main(String[] args) {
        A[] as = new A[8];
        B b = new B();
        for (int i = 0; i < 8; i++) {
            as[i] = new A();
            b.append(as[i].aa());
        }
        b.traverse();
        b.setNull(3);
        b.setNull(6);
        b.traverse();
    }
}
