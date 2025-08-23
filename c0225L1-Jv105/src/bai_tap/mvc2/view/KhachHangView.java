package bai_tap.mvc2.view;

import bai_tap.mvc2.entity.KhachHang;

import java.util.List;
import java.util.Scanner;

public class KhachHangView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<KhachHang> khachHangList) {
        for (KhachHang khachHang : khachHangList) {
            if (khachHang !=null){
                System.out.println(khachHang);
            }else {
                break;
            }
        }
    }
    public static KhachHang inputDataForNewkhachHang() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        KhachHang khachHang = new KhachHang(id, name, email, address);
        return khachHang;

    }
}
