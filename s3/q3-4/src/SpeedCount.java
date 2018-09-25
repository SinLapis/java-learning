public class SpeedCount {
    private static double countSpeed(double distance, double time){
        return distance / time;
    }
    public static void main(String[] args) {
        double d1 = 550;
        double t1 = 20;
        System.out.println(countSpeed(d1, t1));
        double d2 =  1367.7;
        double t2 = 5.4;
        System.out.println(countSpeed(d2, t2));
    }
}
