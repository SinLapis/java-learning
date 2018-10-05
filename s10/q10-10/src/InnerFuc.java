interface Export {
    void print();
}

public class InnerFuc {
    Export getExport(int i) {
        if (i == 0) {
            class Inner implements Export {
                @Override
                public void print() {
                    System.out.println("inner");
                }
            }
            return new Inner();
        } else {
            class Inner implements Export {
                @Override
                public void print() {
                    System.out.println("inner else");
                }
            }
            return new Inner();
        }
    }

    public static void main(String[] args) {
        InnerFuc i = new InnerFuc();
        i.getExport(1).print();
    }
}
