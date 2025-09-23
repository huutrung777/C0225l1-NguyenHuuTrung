package bai_tap.CaseStudy.View;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Utill.CheckValidateEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                break;
            }
        }
    }
    public static Employee inputDataForNewEmployee() {

        String maNV;
        while (true) {
            System.out.print("Nhập mã nhân viên (định dạng NV-YYYY, ví dụ NV-1234): ");
            maNV = scanner.nextLine();
            if (CheckValidateEmployee.checkMaNhanVien(maNV)) {
                break;
            } else {
                System.out.println("Mã nhân viên không hợp lệ! Ví dụ hợp lệ: NV-1234");
            }
        }

        String name ="";
        do {
            System.out.println("Nhập tên");
            name =scanner.nextLine();
        }while (!CheckValidateEmployee.checkName(name));
        String ngaySinh="";
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
            ngaySinh = scanner.nextLine();
        }while (!CheckValidateEmployee.checkNgaySinh(ngaySinh));
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        int cmnd;
        while (true) {
            System.out.println("Nhập số CMND (9 hoặc 12 số):");
            String cmndInput = scanner.nextLine();
            if (CheckValidateEmployee.checkCMND(cmndInput)) {
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
        } while (!CheckValidateEmployee.checkSoDienThoai(phone));
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ:");
        System.out.println("Trung cấp, Cao đẳng, Đại học và Sau đại học");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí:");
        System.out.println("lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        String viTri = scanner.nextLine();
        double luong;
        do {
            System.out.println("Nhập lương (> 0):");
            luong = Double.parseDouble(scanner.nextLine());
        } while (!CheckValidateEmployee.checkLuong(luong));
        Employee employee = new Employee(maNV,name,ngaySinh,gioiTinh,cmnd,phone,email,trinhDo,viTri,luong);
        return employee;

    }
}