package bai_tap.bai7.bai2;

public class main {
    public static void main(String[] args) {
        Object[] shapes = new Object[3];
        shapes[0] = new Square(5);
        shapes[1] = new Circle(3);
        shapes[2] = new Square(4);

        for (Object shape : shapes) {
            if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("Square - Area: " + s.getSide());
                if (s instanceof Colorable) {
                    s.howToColor();
                }
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle - Area: " + c.getRadius());
            }

            System.out.println("------");
        }
    }
}
