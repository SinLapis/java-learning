public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }
    public static void main(String[] args) {
        Storage st = new Storage();
        String s = "abcdefg";
        System.out.print(st.storage(s));
    }
}
