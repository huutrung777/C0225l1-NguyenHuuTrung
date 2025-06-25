package bai_tap.bai19;

import java.util.Scanner;

public class ValidateSoDienThoai {
    public static boolean laSoDienThoaiHopLe(String sdt) {
        return sdt.matches("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại cần kiểm tra: ");
        String sdt = scanner.nextLine();

        if (laSoDienThoaiHopLe(sdt)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
