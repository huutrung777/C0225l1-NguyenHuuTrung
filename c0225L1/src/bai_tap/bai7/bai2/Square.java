package bai_tap.bai7.bai2;

public class Square implements Colorable {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side*side;
    }

    @Override
    public void howToColor() {
        System.out.println("Tô màu");
    }
}
