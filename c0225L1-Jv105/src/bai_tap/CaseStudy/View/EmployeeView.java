package bai_tap.CaseStudy.View;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Utill.CheckValidate;
import bai_tap.mvc1.entity.Student;

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

        int id;
        while (true) {
            System.out.println("Nhập mã nhân viên (định dạng NV-YYYY, chỉ nhập số YYYY):");
            String idInput = scanner.nextLine();
            if (CheckValidate.checkMaNhanVien("NV-" + idInput)) {
                id = Integer.parseInt(idInput);
                break;
            } else {
                System.out.println(" Mã nhân viên không hợp lệ, ví dụ NV-1234");
            }
        }
        String name ="";
        do {
            System.out.println("Nhập tên");
            name =scanner.nextLine();
        }while (!CheckValidate.checkName(name));
        String ngaySinh="";
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
            ngaySinh = scanner.nextLine();
        }while (!CheckValidate.checkNgaySinh(ngaySinh));
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        int cmnd;
        while (true) {
            System.out.println("Nhập số CMND (9 hoặc 12 số):");
            String cmndInput = scanner.nextLine();
            if (CheckValidate.checkCMND(cmndInput)) {
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
        } while (!CheckValidate.checkSoDienThoai(phone));
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
        } while (!CheckValidate.checkLuong(luong));
        Employee employee = new Employee(id,name,ngaySinh,gioiTinh,cmnd,phone,email,trinhDo,viTri,luong);
        return employee;

    }
}