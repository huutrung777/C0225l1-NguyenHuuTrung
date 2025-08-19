package bai_tap.mvc1.entity;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "salary=" + salary +
                '}';
    }
}
