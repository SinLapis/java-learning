import java.util.ArrayList;

interface Selector {
    boolean end();

    Object current();

    void next();
}

class TestString {
    String s;

    TestString(String s) {
        this.s = s;
    }

    void print() {
        System.out.println(s);
    }
}

public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size()) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 20; i++) {
            sequence.add(new TestString("test " + i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()) {
            ((TestString)selector.current()).print();
            selector.next();
        }
    }
}
