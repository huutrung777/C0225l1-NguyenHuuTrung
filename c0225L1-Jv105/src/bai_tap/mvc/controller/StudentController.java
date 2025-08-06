package bai_tap.mvc.controller;

import bai_tap.mvc.entity.Student;
import bai_tap.mvc.service.IStudentService;
import bai_tap.mvc.service.StudentService;
import bai_tap.mvc.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new IStudentService() {
        @Override
        public List<Student> findAll() {
            return List.of();
        }

        @Override
        public void add(Student student) {

        }

        @Override
        public boolean deleteById(int code) {
            return false;
        }
    };
    private Scanner scanner = new Scanner(System.in);
    private final int DISPLAY = 1;
    private final int ADD = 2;

    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên:\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    // danh sách (gọi dữ liệu từ service => hiển thị
                    List<Student> studentList = studentService.findAll();
                    StudentView.display(studentList);
                    break;
                case ADD:
                    // thêmm ới
                    // hiển thị form thêm dữ liệu => gọi service để them mơ
                    Student student = StudentView.inputData();
                    studentService.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần xoá");
                    int code = Integer.parseInt(scanner.nextLine());
                    boolean isDelete = studentService.deleteById(code);
                    if (isDelete) {
                        System.out.println("Xoá thành công");
                    } else {
                        System.out.println("Không tìm thấy mã");
                    }
                    // xoá
                    break;
                case 4:
                    // tìm kiếm
                    break;
                default:
                    flag = false;

            }
        }
    }
}
