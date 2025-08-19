package bai_tap.mvc1.controller;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.entity.Teacher;
import bai_tap.mvc1.service.IStudentService;
import bai_tap.mvc1.service.ITeacherService;
import bai_tap.mvc1.service.StudentService;
import bai_tap.mvc1.service.TeacherService;
import bai_tap.mvc1.view.StudentView;
import bai_tap.mvc1.view.TeacherView;

import java.util.List;
import java.util.Scanner;

public class TeacherController {
    public static void displayMenu() {
        ITeacherService teacherService = new TeacherService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý Giáo viên----------");
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
                    List<Teacher> teacherList = teacherService.findAll();
                    TeacherView.displayList(teacherList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Teacher teacher = TeacherView.inputDataForTeacherNew();
                    boolean isAddSuccess = teacherService.add(teacher);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    System.out.println("Xoá");
                    System.out.print("Nhập id giao vien cần xoá: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleteSuccess = teacherService.delete(deleteId);
                    if (isDeleteSuccess) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Xoá không thành công (không tìm thấy id)");
                    }
                    break;

                case 4:
                    System.out.println("Tìm kiếm");
                    System.out.println("Tìm kiếm");
                    System.out.print("Nhập id Giao vien cần tìm: ");
                    String searchId = scanner.nextLine();
                    Teacher foundStudent = teacherService.findById(searchId);
                    if (foundStudent != null) {
                        System.out.println("Đã tìm thấy: " + foundStudent);
                    } else {
                        System.out.println("Không tìm thấy giao vien có id = " + searchId);
                    }
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
