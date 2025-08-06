package bai_tap.bai18.Util;
import java.util.Scanner;
public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String nhapChuoi(String thongBao) {
        System.out.print(thongBao);
        return scanner.nextLine().trim();
    }

    public static double nhapSoThuc(String thongBao) {
        double value;
        while (true) {
            try {
                System.out.print(thongBao);
                value = Double.parseDouble(scanner.nextLine());
                if (value >= 0) break;
                System.out.println("Vui lòng nhập số >= 0");
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng! Nhập lại.");
            }
        }
        return value;
    }
}
