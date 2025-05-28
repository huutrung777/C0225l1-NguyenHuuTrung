package bai_tap.bai6.Bai1;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, "Xanh");
        System.out.println(c);
        System.out.println("Diện tích: " + c.getArea());

        Cylinder cy = new Cylinder(5.0, "Xanh", 10.0);
        System.out.println(cy);
        System.out.println("Thể tích: " + cy.getVolume());
    }
}
