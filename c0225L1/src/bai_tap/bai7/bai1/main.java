package bai_tap.bai7.bai1;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Resizeable[] shapes={
                new Circle(3.0),
                new Rectangle(4.0,5.0),
                new Square(4.0)
        };
        Random random = new Random();
        for (Resizeable shape : shapes) {
            double percent = 1+random.nextInt(100);

            System.out.println("-----");
            System.out.println("Trước khi resize: Diện tích = " + getArea(shape));
            shape.resize(percent);
            System.out.println("Sau khi resize " + percent + "%: Diện tích = " + getArea(shape));
        }
    }
    private static double getArea(Resizeable shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).getArea();
        }else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getArea();
        }else if (shape instanceof Square) {
            return ((Square) shape).getArea();
        }
        return 0;
    }

}
