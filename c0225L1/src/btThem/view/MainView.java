package btThem.view;

import java.util.Scanner;

    public class MainView {
        static final Scanner sc = new Scanner(System.in);

        public int displayMainView() {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG----");
            System.out.println("-------1.Thên mới Phương tiện-------");
            System.out.println("-------2.Hiển thị phương tiện-------");
            System.out.println("-------3.Tìm kiếm Phương Tiện------------");
            System.out.println("-------4.Xóa Phương Tiện----------------------");
            System.out.println("-------5.Thoát----------------------");
            System.out.print("Mời nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            return choice;
        }
    }
