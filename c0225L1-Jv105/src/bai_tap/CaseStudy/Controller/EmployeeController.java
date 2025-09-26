package bai_tap.CaseStudy.Controller;

import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Service.EmployeeService;
import bai_tap.CaseStudy.Service.IEmployeeService;
import bai_tap.CaseStudy.View.EmployeeView;
import bai_tap.mvc1.entity.Student;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void displayMenu() {
        IEmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý sinh viên----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Cập nhật" +
                    "\n 5. Tim Kiem" +
                    "\n 6. Quay lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<Employee> employeeList=employeeService.findAll();
                    EmployeeView.displayList(employeeList);
                    break;
                    case 2:
                        System.out.println("Thêm mới");
                        Employee employee=EmployeeView.inputDataForNewEmployee();
                        boolean isAddSuccess = employeeService.add(employee);
                        if (isAddSuccess) {
                            System.out.println("Thêm mới thành công");
                        } else {
                            System.out.println("Thêm mới không thành công");
                        }
                        break;
                        case 3:
                            System.out.print("Nhập mã nhân viên cần xoá: ");
                           String deleteId = scanner.nextLine();
                            boolean check = employeeService.delete(deleteId);
                            if (check) {
                                System.out.println("Xoá thành công");
                            } else {
                                System.out.println("Xoá không thành công");
                            }
                            break;
                case 4:
                    System.out.print("Nhập mã nhân viên cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    Employee employeeToUpdate = employeeService.findById(updateId);

                    if (employeeToUpdate == null) {
                        System.out.println("Không tìm thấy nhân viên có mã: " + updateId);
                    } else {
                        EmployeeView.inputDataForUpdateEmployee(employeeToUpdate);
                        boolean isUpdateSuccess = employeeService.update(employeeToUpdate);
                        System.out.println(isUpdateSuccess ? "Cập nhật thành công và đã lưu vào file!" : "Cập nhật thất bại!");
                    }
                    break;
                case 5:
                    System.out.print("Nhập id sinh viên cần tìm: ");
                    String findId = scanner.nextLine();
                    Employee foundEmployee = employeeService.findById(findId);
                    if (foundEmployee != null) {
                        System.out.println("Đã tìm thấy: " + foundEmployee);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có id = " + findId);
                    }
                    break;

                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;

            }

        }
    }
}
