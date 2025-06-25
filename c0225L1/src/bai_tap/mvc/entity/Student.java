package bai_tap.mvc.entity;

public class Student extends Person {
    private float point;
    private String className;

    public Student(long code, String name, String address, int point, String className) {
    }

    public Student(long code, String name, String address, float phone, float point, String className ) {
        super(code, name, address);
        this.point = point;
        this.className = className;

    }

    @Override
    public String getInfoToCSV() {
        return this.getCode()+","+this.getName()+","+this.getAddress()+","+this.getPoint()+","+this.getClassName();
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }
}
