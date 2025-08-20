package bai_tap.mvc2.controller;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.view.StudentView;
import bai_tap.mvc2.entity.khachHang;
import bai_tap.mvc2.service.IkhachHangService;
import bai_tap.mvc2.service.khachHangService;
import bai_tap.mvc2.view.khachHangView;

import java.util.List;
import java.util.Scanner;

public class khachHangController {
    public static void displayMenu() {
        IkhachHangService khachHangService = new khachHangService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý Khach Hang----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<khachHang> khachHangList = khachHangService.findAll();
                    khachHangView.displayList(khachHangList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    khachHang khachHang = khachHangView.inputDataForNewkhachHang();
                    boolean isAddSuccess = khachHangService.add(khachHang);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    System.out.print("Nhập id sinh viên cần xoá: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleteSuccess = khachHangService.delete(deleteId);
                    if (isDeleteSuccess) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Xoá không thành công (không tìm thấy id)");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    System.out.print("Nhập id sinh viên cần tìm: ");
                    String searchId = scanner.nextLine();
                    khachHang foundkhachHang = khachHangService.findById(searchId);
                    if (foundkhachHang != null) {
                        System.out.println("Đã tìm thấy: " + foundkhachHang);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có id = " + searchId);
                    }
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }

        }
    }
}
