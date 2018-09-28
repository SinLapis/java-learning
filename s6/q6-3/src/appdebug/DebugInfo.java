package appdebug;

public class DebugInfo {
    public void print(String... args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
