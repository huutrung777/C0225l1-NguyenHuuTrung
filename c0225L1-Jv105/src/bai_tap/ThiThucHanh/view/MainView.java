package bai_tap.ThiThucHanh.view;

import java.util.Scanner;

public class MainView {

    static Scanner sc = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("=================MENU================");
        System.out.println("--1. Xem Danh Sách -----------");
        System.out.println("--2. Thêm mới--");
        System.out.println("--3. Cập nhật-----------");
        System.out.println("--4. Xóa----------------");
        System.out.println("--5. Tìm kiếm --------------------------");
        System.out.println("--6. Đọc từ File --------------------------");
        System.out.println("--7. Ghi vào File --------------------------");
        System.out.println("--8. Thoát --------------------------");
        System.out.print("Chọn chức năng: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public int listMenu() {
        System.out.println("===============Hiển thị===============");
        System.out.println("----1. Hiển thị danh sách -------------");
        System.out.println("----2. Quay lại -----------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int addMenu() {
        System.out.println("==============Thêm mới=============");
        System.out.println("----1.Thêm danh bạ mới -------------");
        System.out.println("----2.Quay lại -------------");
       ;
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());

        return choice;
    }
    public int UpMenu() {
        System.out.println("==============Cập nhật=============");
        System.out.println("----1.Nhập số đt -------------");
        System.out.println("----2.Quay lại -------------");
        ;
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public int searchMenu() {
        System.out.println("===============SEARCH MENU=============");
        System.out.println("----1. Tìm kiếm Danh bạ -------------");
        System.out.println("----3. Quay lại -----------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public int deleteMenu() {
        System.out.println("============DELETE MENU===========");
        System.out.println("----1. Xóa Số Điện Thoại -------------");
        System.out.println("----3. Quay lại ------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }






}
