package bai_tap.bai8.view;

import bai_tap.bai8.controller.PTGTController;
import bai_tap.bai8.entity.Oto;
import bai_tap.bai8.entity.PhuongTienGiaoThong;
import bai_tap.bai8.entity.XeTai;

import java.util.Scanner;

public class PhuongTienGiaoThongView {
public static void displayThemMoiPT(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("-----------------------------------------------");
    System.out.println("Thêm mới phương tiện");
    System.out.println("1. Thêm xe tải");
    System.out.println("2. Thêm ô tô");
    System.out.println("3. Thêm xe máy");
    int choice = Integer.parseInt(scanner.nextLine());
    switch (choice) {
        case 1:
            PhuongTienGiaoThong PTGT=inputPTGTXeTai();
            PTGTController.add(PTGT);
            System.out.println("Thêm mới thành công");
            break;








    }

}
private static PhuongTienGiaoThong inputPTGTXeTai() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập Biển kiểm soát");
    String BienkiemSoat = scanner.nextLine();
    System.out.println("Nhập hãng sản xuất");
    String TenHangSX = scanner.nextLine();
    System.out.println("Nhập năm sản xuất");
    int NamSX = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhập chủ sở hữu");
    String ChuSoHuu= scanner.nextLine();
    System.out.println("Nhập tải trọng");
    Double TrongTai = Double.parseDouble(scanner.nextLine());
    return new XeTai(BienkiemSoat,TenHangSX,NamSX,ChuSoHuu,TrongTai);
}
//private static PhuongTienGiaoThong inputPTGTOto() {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Nhập Biển kiểm soát");
//    String BienkiemSoat = scanner.nextLine();
//    System.out.println("Nhập hãng sản xuất");
//    String TenHangSX = scanner.nextLine();
//    System.out.println("Nhập năm sản xuất");
//    int NamSX = Integer.parseInt(scanner.nextLine());
//    System.out.println("Nhập chủ sở hữu");
//    String ChuSoHuu= scanner.nextLine();
//    System.out.println("kiểu Xe");
//    String KieuXe= scanner.nextLine();
//    System.out.println("Nhập số chỗ ngồi");
//    int SoChoNgoi = Integer.parseInt(scanner.nextLine());
//    return new Oto(BienkiemSoat,TenHangSX,NamSX,ChuSoHuu,KieuXe);
//
//
//}


}
