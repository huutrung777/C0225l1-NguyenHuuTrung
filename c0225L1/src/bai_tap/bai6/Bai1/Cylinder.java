package bai_tap.bai6.Bai1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // Gọi hàm tạo của Circle
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return getArea() * height;
    }
    public String toString() {
        return "Hình trụ: " + super.toString() + ", chiều cao = " + height;
    }
}

