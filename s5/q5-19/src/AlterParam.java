public class AlterParam {
    AlterParam(String... args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        AlterParam a = new AlterParam("aaa", "bbbe");
        String[] bs = {"bbb", "test"};
        AlterParam b = new AlterParam(bs);
//        String[] bs2 = {"addon"};
//        AlterParam c = new AlterParam(bs, bs2);
        //然而不能写两个数组上去
    }
}
