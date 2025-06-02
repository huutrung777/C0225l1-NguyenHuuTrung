package bai_tap.bai7.bai2;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return Math.PI * radius * radius;
    }
}
