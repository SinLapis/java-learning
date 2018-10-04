abstract class AbstractMove {
}

class MoveTest extends AbstractMove {
    void test() {
        System.out.println("test");
    }
}

class MoveTest2 extends AbstractMove {
    void test() {
        System.out.println("test2");
    }
}

public class Move {
    static void moveTo(AbstractMove move) {
        ((MoveTest)move).test();
    }
    public static void main(String[] args) {
        MoveTest m = new MoveTest();
        //! MoveTest2 m = new MoveTest2();
        moveTo(m);
    }
}
