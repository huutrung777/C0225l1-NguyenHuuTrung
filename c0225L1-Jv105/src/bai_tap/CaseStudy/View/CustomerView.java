package bai_tap.CaseStudy.View;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Utill.CheckValidateCustomer;
import bai_tap.CaseStudy.Utill.CheckValidateEmployee;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<Customer> customerList) {
        for (Customer customer : customerList) {
            if (customer != null) {
                System.out.println(customer);
            } else {
                break;
            }
        }
    }
    public static Customer inputDataForNewCustomer() {

        String maKH;
        while (true) {
            System.out.print("Nhập mã khách hàng (định dạng KH-YYYY, ví dụ KH-1234): ");
            maKH = scanner.nextLine();
            if (CheckValidateCustomer.checkMaKhachHang(maKH)) {
                break;
            } else {
                System.out.println("Sai định dạng! Ví dụ hợp lệ: KH-1234");
            }
        }

        String name = "";
        do {
            System.out.println("Nhập tên");
            name = scanner.nextLine();
        } while (!CheckValidateCustomer.checkName(name));
        String ngaySinh = "";
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
            ngaySinh = scanner.nextLine();
        } while (!CheckValidateEmployee.checkNgaySinh(ngaySinh));
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        int cmnd;
        while (true) {
            System.out.println("Nhập số CMND (9 hoặc 12 số):");
            String cmndInput = scanner.nextLine();
            if (CheckValidateCustomer.checkCMND(cmndInput)) {
                cmnd = Integer.parseInt(cmndInput);
                break;
            } else {
                System.out.println("CMND không hợp lệ, vui lòng nhập lại!");
            }
        }

        String phone;
        do {
            System.out.println("Nhập số điện thoại (10 số, bắt đầu bằng 0):");
            phone = scanner.nextLine();
        } while (!CheckValidateCustomer.checkSoDienThoai(phone));
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách :Diamond, Platinum, Gold, Silver, Member");
        String loaiKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diachi = scanner.nextLine();
        Customer customer = new Customer(maKH, name, ngaySinh, gioiTinh, cmnd, phone, email, loaiKhach, diachi);
        return customer;
    }
}
