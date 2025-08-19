package bai_tap.mvc1.view;

import bai_tap.mvc1.entity.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<Teacher> teacherList) {
        for (Teacher teacher : teacherList) {
            if (teacher !=null){
                System.out.println(teacher);
            }else {
                break;
            }
        }
    }
    public static Teacher inputDataForTeacherNew(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        Teacher teacher = new Teacher(id, name, salary);
        return teacher;

    }
}
