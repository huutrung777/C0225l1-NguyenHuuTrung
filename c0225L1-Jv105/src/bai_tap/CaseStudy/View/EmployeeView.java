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
    public static void inputDataForUpdateEmployee(Employee employee) {
        System.out.println("Mã nhân viên: " + employee.getMaID());

        System.out.println("Tên hiện tại: " + employee.getHoTen());
        String name;
        do {
            System.out.print("Nhập tên mới (Enter để giữ nguyên): ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                name = employee.getHoTen();
                break;
            }
        } while (!CheckValidateEmployee.checkName(name));
        employee.setHoTen(name);

        System.out.println("Ngày sinh hiện tại: " + employee.getNgaySinh());
        String ngaySinh;
        do {
            System.out.print("Nhập ngày sinh mới (dd/MM/yyyy) (Enter để giữ nguyên): ");
            ngaySinh = scanner.nextLine();
            if (ngaySinh.isEmpty()) {
                ngaySinh = employee.getNgaySinh();
                break;
            }
        } while (!CheckValidateEmployee.checkNgaySinh(ngaySinh));
        employee.setNgaySinh(ngaySinh);
        System.out.println("Giới tính hiện tại: " + employee.getGioiTinh());
        System.out.print("Nhập giới tính mới (Enter để giữ nguyên): ");
        String gioiTinh = scanner.nextLine();
        if (!gioiTinh.isEmpty()) {
            employee.setGioiTinh(gioiTinh);
        }

        System.out.println("CMND hiện tại: " + employee.getSoCMND());
        String cmnd;
        do {
            System.out.print("Nhập CMND mới (9 hoặc 12 số) (Enter để giữ nguyên): ");
            cmnd = scanner.nextLine();
            if (cmnd.isEmpty()) {
                cmnd = String.valueOf(employee.getSoCMND());
                break;
            }
        } while (!CheckValidateEmployee.checkCMND(cmnd));
        employee.setSoCMND(Integer.parseInt(cmnd));

        System.out.println("Số điện thoại hiện tại: " + employee.getSoDienThoai());
        String phone;
        do {
            System.out.print("Nhập số điện thoại mới (Enter để giữ nguyên): ");
            phone = scanner.nextLine();
            if (phone.isEmpty()) {
                phone = employee.getSoDienThoai();
                break;
            }
        } while (!CheckValidateEmployee.checkSoDienThoai(phone));
        employee.setSoDienThoai(phone);

        System.out.println("Email hiện tại: " + employee.getEmail());
        System.out.print("Nhập email mới (Enter để giữ nguyên): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) {
            employee.setEmail(email);
        }

        System.out.println("Trình độ hiện tại: " + employee.getTrinhDo());
        System.out.print("Nhập trình độ mới (Enter để giữ nguyên): ");
        String trinhDo = scanner.nextLine();
        if (!trinhDo.isEmpty()) {
            employee.setTrinhDo(trinhDo);
        }

        System.out.println("Vị trí hiện tại: " + employee.getViTri());
        System.out.print("Nhập vị trí mới (Enter để giữ nguyên): ");
        String viTri = scanner.nextLine();
        if (!viTri.isEmpty()) {
            employee.setViTri(viTri);
        }

        System.out.println("Lương hiện tại: " + employee.getLuong());
        double luong;
        while (true) {
            System.out.print("Nhập lương mới (Enter để giữ nguyên): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                luong = employee.getLuong();
                break;
            }
            try {
                luong = Double.parseDouble(input);
                if (CheckValidateEmployee.checkLuong(luong)) {
                    break;
                } else {
                    System.out.println("Lương phải > 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lương không hợp lệ, vui lòng nhập số.");
            }
        }
        employee.setLuong(luong);

        System.out.println("Cập nhật nhân viên thành công!");

    }




}