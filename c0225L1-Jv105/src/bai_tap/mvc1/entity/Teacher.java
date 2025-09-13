package bai_tap.mvc1.entity;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.getSalary();
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
