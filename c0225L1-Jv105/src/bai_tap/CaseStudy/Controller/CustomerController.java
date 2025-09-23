package bai_tap.CaseStudy.Controller;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Entity.Employee;
import bai_tap.CaseStudy.Service.CustomerService;
import bai_tap.CaseStudy.Service.EmployeeService;
import bai_tap.CaseStudy.Service.ICustomerService;
import bai_tap.CaseStudy.Service.IEmployeeService;
import bai_tap.CaseStudy.View.CustomerView;
import bai_tap.CaseStudy.View.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý sinh viên----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Quay lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<Customer> customerList=customerService.findAll();
                    CustomerView.displayList(customerList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customer customer=CustomerView.inputDataForNewCustomer();
                    boolean isAddSuccess = customerService.add(customer);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã nhân viên cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean check = customerService.delete(deleteId);
                    if (check) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Xoá không thành công");
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
