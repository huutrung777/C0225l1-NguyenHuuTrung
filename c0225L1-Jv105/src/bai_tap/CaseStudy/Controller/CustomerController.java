package bai_tap.CaseStudy.Controller;

import bai_tap.CaseStudy.Entity.Customer;
import bai_tap.CaseStudy.Service.CustomerService;
import bai_tap.CaseStudy.Service.ICustomerService;
import bai_tap.CaseStudy.View.CustomerView;


import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý khách hàng----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Cập nhật" +
                    "\n 5. Tim kiem"+
                    "\n 6. Quay lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số từ 1–6");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<Customer> customerList = customerService.findAll();
                    CustomerView.displayList(customerList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customer customer = CustomerView.inputDataForNewCustomer();
                    boolean isAddSuccess = customerService.add(customer);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã nhân viên cần xoá: ");
                    String deleteId = scanner.nextLine();
                    boolean check = customerService.delete(deleteId);
                    if (check) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Xoá không thành công");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã khách hàng cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    Customer customerToUpdate = null;
                    for (Customer c : customerService.findAll()) {
                        if (c.getMaID().equals(updateId)) {
                            customerToUpdate = c;
                            break;
                        }
                    }

                    if (customerToUpdate == null) {
                        System.out.println("Không tìm thấy khách hàng có mã: " + updateId);
                    } else {
                        CustomerView.inputDataForUpdateCustomer(customerToUpdate);
                        if (customerService.update(customerToUpdate)) {
                            System.out.println("Cập nhật thành công và lưu vào file!");
                        } else {
                            System.out.println("Cập nhật thất bại");
                        }
                    }
                    break;
                    case 5:
                        System.out.print("Nhập id sinh viên cần tìm: ");
                        String findId = scanner.nextLine();
                        Customer foundCustomer = customerService.findByMaNhanVien(findId);
                        if (foundCustomer != null) {
                            System.out.println("Đã tìm thấy: " + foundCustomer);
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