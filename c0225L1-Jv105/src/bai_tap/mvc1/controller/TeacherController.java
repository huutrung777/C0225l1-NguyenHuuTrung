package bai_tap.mvc1.controller;

import bai_tap.mvc1.entity.Teacher;
import bai_tap.mvc1.service.ITeacherService;
import bai_tap.mvc1.service.TeacherService;
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
                    System.out.print("Nhập id sinh viên cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean check = teacherService.delete(deleteId);
                    if (check) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Xoá không thành công");
                    }
                    break;

                case 4:
                    System.out.print("Nhập id sinh viên cần tìm: ");
                    int findId = Integer.parseInt(scanner.nextLine());
                    Teacher foundTeacher = teacherService.findById(findId);
                    if (foundTeacher != null) {
                        System.out.println("Đã tìm thấy: " + foundTeacher);
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
