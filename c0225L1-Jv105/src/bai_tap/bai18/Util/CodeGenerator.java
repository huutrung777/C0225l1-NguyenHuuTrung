package bai_tap.bai18.Util;
import java.util.UUID;
public class CodeGenerator {
    public static String sinhMa() {
        return "SP" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

    }
}
