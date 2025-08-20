package bai_tap.mvc2.view;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc2.entity.khachHang;

import java.util.List;
import java.util.Scanner;

public class khachHangView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<khachHang> khachHangList) {
        for (khachHang khachHang : khachHangList) {
            if (khachHang !=null){
                System.out.println(khachHang);
            }else {
                break;
            }
        }
    }
    public static khachHang inputDataForNewkhachHang() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        khachHang khachHang = new khachHang(id, name, email, address);
        return khachHang;

    }
}
