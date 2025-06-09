package bai_tap.bai8.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("1. Thêm mới phương tiện.");
        System.out.println("2. Hiện thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");

        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
