package bai_tap.mvc3.View;
import bai_tap.mvc3.Entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class XeTaiView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<XeTai> xeTaiList) {
        for (XeTai xeTai : xeTaiList) {
            if (xeTai != null) {
                System.out.println(xeTai);
            } else {
                break;
            }
        }
    }
    public static XeTai inputDataForNewXeTai() {
        System.out.println("Nhập biển số");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập Năm Sản Xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở Hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập Trọng tải");
        double trongtai= Double.parseDouble(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongtai);
        return xeTai;
    }
    public static String deleteBienSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát Xe tải cần xóa: ");
        return scanner.nextLine();
    }
    public static String searchXeTai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát Xe Tải cần tìm: ");
        return scanner.nextLine();
    }

}
