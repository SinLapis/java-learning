public class TestBaseType {
    public static void main(String[] args) {
        Boolean bb = false;
        boolean b = bb;
        Character cb = 'a';
        char c = cb;
        Byte byb = 1;
        byte by = byb;
        Short sb = 2;
        short s = sb;
        Integer ib = 34567;
        int i = ib;
        Long lb = 1234599997999L;
        //错误写法：Long lb = 123456;
        long l = lb;
        long l2 = 123456789;
        //实际=后面是int型
        Long lb2 = l2;
        Float fb = 1.1F;
        //错误写法：Float fb = 1.1;
        float f = fb;
        //错误：float f2 = 1.1，此时不会转换，1.1为double型
        Double db = 1.2;
        double d = db;

    }
}
