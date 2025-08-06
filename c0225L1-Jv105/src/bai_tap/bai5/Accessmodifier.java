package bai_tap.bai5;
class Circle{
    private double radius=1.0;
    public String color="red";
    public Circle(){

    }
    public Circle(double r){
        this.radius=r;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;  // PI * r^2
    }
}
public class Accessmodifier {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Bán kính: " + circle1.getRadius());
        System.out.println("Circle 1 - Diện tích: " + circle1.getArea());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 - Bán kính: " + circle2.getRadius());
        System.out.println("Circle 2 - Diện tích: " + circle2.getArea());

    }
}
