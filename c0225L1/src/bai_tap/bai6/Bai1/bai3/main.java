package bai_tap.bai6.Bai1.bai3;

public class main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1, 2, 0.5f, 1);
        System.out.println("Trước khi di chuyển: " + p);
        p.move();
        System.out.println("Sau khi di chuyển: " + p);
    }
}
