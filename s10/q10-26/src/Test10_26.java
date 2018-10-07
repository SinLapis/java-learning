class OuterA {
    class InnerA {
        InnerA(int i) {
            System.out.println(i);
        }
    }
}

class OuterB {
    class InnerB extends OuterA.InnerA {
        InnerB(OuterA oa, int i) {
            oa.super(i);
        }
    }
}
public class Test10_26 {
}
