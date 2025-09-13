package bai_tap.mvc3.View;
import bai_tap.mvc3.Entity.XeMay;

import java.util.List;
import java.util.Scanner;

public class XeMayView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<XeMay> xeMayList) {
        for (XeMay xeMay : xeMayList) {
            if (xeMay != null) {
                System.out.println(xeMay);
            } else {
                break;
            }
        }
    }

    public static XeMay inputDataForNewXeMay() {
        System.out.println("Nhập biển số");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập Năm Sản Xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở Hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập Công xuất");
        double congXuat = Double.parseDouble(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congXuat);
        return xeMay;
    }
    public static String deleteBienSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát Xe Máy cần xóa: ");
        return scanner.nextLine();
    }
    public static String searchXeMay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát Xe Máy cần tìm: ");
        return scanner.nextLine();
    }

}
