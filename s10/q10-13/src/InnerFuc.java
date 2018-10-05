interface Export {
    void print();
}

public class InnerFuc {
    public static void main(String[] args) {
        Export e = new Export() {
            @Override
            public void print() {
                System.out.println("anonymous inner");
            }
        };
        e.print();
    }
}
