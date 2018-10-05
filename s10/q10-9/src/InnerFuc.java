interface Export {
    void print();
}

public class InnerFuc {
    Export getExport() {
        class Inner implements Export {
            @Override
            public void print() {
                System.out.println("inner");
            }
        }
        return new Inner();
    }
    public static void main(String[] args) {
        InnerFuc i = new InnerFuc();
        i.getExport().print();
    }
}
