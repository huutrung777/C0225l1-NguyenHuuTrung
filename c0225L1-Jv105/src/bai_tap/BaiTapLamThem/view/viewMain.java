package bai_tap.BaiTapLamThem.view;

import bai_tap.BaiTapLamThem.controller.QlySanPham;
import bai_tap.BaiTapLamThem.entity.SanPham;

import java.util.Scanner;

public class viewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý sinh viên----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh Sách");
                    SanPham[] sanPhamList = QlySanPham.getAll();
                    for (SanPham sanpham : sanPhamList) {
                        if(sanpham != null) {
                            System.out.println(sanpham);
                        }else {
                            break;
                        }
                    }
                    break;
                    case 2:
                        System.out.println("thêm mới");
                        System.out.println("Nhập id");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập tên");
                        String name = scanner.nextLine();
                        System.out.println("Nhập giá");
                        double price = Double.parseDouble(scanner.nextLine());
                        SanPham sanpham = new SanPham(id, name, price);
                        QlySanPham.add(sanpham);
                        break;
                        case 3:
                            System.out.println("xóa");
                            break;
                            case 4:
                                System.out.println("Tìm kiếm");
                                
                                break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
