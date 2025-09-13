package bai_tap.mvc3.View;

import bai_tap.mvc3.Entity.Oto;

import java.util.List;
import java.util.Scanner;

public class OtoView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<Oto> OtoList) {
        for (Oto Oto : OtoList) {
            if (Oto !=null){
                System.out.println(Oto);
            }else {
                break;
            }
        }
    }
    public static Oto inputDataForNewOto() {
        System.out.println("Nhập biển số");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhập Năm Sản Xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở Hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soChoNGoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String kieuXe = scanner.nextLine();
        Oto oto=new Oto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,soChoNGoi,kieuXe);
        return oto;
    }
    public static String deleteBienSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát ô tô cần xóa: ");
        return scanner.nextLine();
    }
    public static String searchOto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát ô tô cần tìm: ");
        return scanner.nextLine();
    }


}
