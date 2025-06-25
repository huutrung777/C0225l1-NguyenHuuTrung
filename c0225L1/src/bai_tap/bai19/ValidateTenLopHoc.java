package bai_tap.bai19;

import java.util.Scanner;

public class ValidateTenLopHoc {
    public static boolean kiemTraTenLop(String tenLop) {
        return tenLop.matches("^[CAP]\\d{4}[GHIK]$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp cần kiểm tra: ");
        String tenLop = scanner.nextLine();

        if (kiemTraTenLop(tenLop)) {
            System.out.println("Tên lớp hợp lệ.");
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
    }
}
