package bai_tap.mvc1.view;

import bai_tap.mvc1.entity.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<Student> studentList) {
        for (Student student : studentList) {
            if (student !=null){
                System.out.println(student);
            }else {
                break;
            }
        }
    }
    public static Student inputDataForNewStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm");
        float socre = Float.parseFloat(scanner.nextLine());
        Student student = new Student(id, name, socre);
        return student;
    }
}
