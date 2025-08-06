package bai_tap.bai5;
 class Student {
    private String name = "John";
    private String classes = "C02";
    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + classes);
    }
}
public class XayDungLopChiGhiTrongJava {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setClasses("A08");
         student.displayInfo();
        System.out.println("Đã thiết lập thông tin student thành công!");

    }

}
