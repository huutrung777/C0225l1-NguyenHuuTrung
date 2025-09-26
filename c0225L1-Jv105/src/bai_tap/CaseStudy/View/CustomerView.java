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
    public static void inputDataForUpdateCustomer(Customer customer) {
        System.out.println("Mã khách hàng: " + customer.getMaID());

        System.out.print("Tên hiện tại: " + customer.getHoTen() + " | Nhập tên mới (Enter để giữ nguyên): ");
        String name;
        do {
            name = scanner.nextLine();
            if (name.isEmpty()) {
                name = customer.getHoTen();
                break;
            }
        } while (!CheckValidateCustomer.checkName(name));
        customer.setHoTen(name);

        System.out.print("Ngày sinh hiện tại: " + customer.getNgaySinh());
        System.out.println(" | Nhập ngày sinh mới (Enter để giữ nguyên): ");
        String ngaySinh;
        do {
            ngaySinh = scanner.nextLine();
            if (ngaySinh.isEmpty()) {
                ngaySinh = customer.getNgaySinh();
                break;
            }
        } while (!CheckValidateEmployee.checkNgaySinh(ngaySinh));
        customer.setNgaySinh(ngaySinh);

        System.out.print("Giới tính hiện tại: " + customer.getGioiTinh());
        System.out.println(" | Nhập giới tính mới (Enter để giữ nguyên): ");;
        String gioiTinh = scanner.nextLine();
        if (!gioiTinh.isEmpty()) customer.setGioiTinh(gioiTinh);

        System.out.print("CMND hiện tại: " + customer.getSoCMND());
        System.out.println(" | Nhập CMND mới (Enter để giữ nguyên): ");
        String cmndInput;
        do {
            cmndInput = scanner.nextLine();
            if (cmndInput.isEmpty()) {
                cmndInput = String.valueOf(customer.getSoCMND());
                break;
            }
        } while (!CheckValidateCustomer.checkCMND(cmndInput));
        customer.setSoCMND(Integer.parseInt(cmndInput));

        System.out.print("Số điện thoại hiện tại: " + customer.getSoDienThoai());
        System.out.println(" | Nhập số điện thoại mới (Enter để giữ nguyên): ");
        String phone;
        do {
            phone = scanner.nextLine();
            if (phone.isEmpty()) {
                phone = customer.getSoDienThoai();
                break;
            }
        } while (!CheckValidateCustomer.checkSoDienThoai(phone));
        customer.setSoDienThoai(phone);

        System.out.print("Email hiện tại: " + customer.getEmail());
        System.out.println(" | Nhập email mới (Enter để giữ nguyên): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) customer.setEmail(email);

        System.out.print("Loại khách hiện tại: " + customer.getLoaiKhach());
        System.out.println( " | Nhập loại khách mới (Enter để giữ nguyên): ");
        String loaiKhach = scanner.nextLine();
        if (!loaiKhach.isEmpty()) customer.setLoaiKhach(loaiKhach);

        System.out.print("Địa chỉ hiện tại: " + customer.getDiachi());
        System.out.println(" | Nhập địa chỉ mới (Enter để giữ nguyên): ");

        String diachi = scanner.nextLine();
        if (!diachi.isEmpty()) customer.setDiachi(diachi);

        System.out.println("Cập nhật thông tin khách hàng thành công!");
    }




}