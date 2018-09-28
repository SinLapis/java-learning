import outside.OutsideAccess;
import protect.PackageAccess;

public class MainProtectTest {
    public static void main(String... args) {
        PackageAccess p = new PackageAccess();
        OutsideAccess o = new OutsideAccess();
        p.getProtectString();
        o.getProtectString();
    }
}
