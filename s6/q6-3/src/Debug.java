
public class Debug {
    public static void main(String... args) {
        appdebug.DebugInfo ad = new appdebug.DebugInfo();
        app.DebugInfo a = new app.DebugInfo();
        ad.print(args);
        System.out.println("--");
        a.print(args);
    }
}
