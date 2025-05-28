package bai_tap.bai6.Bai1.bai3;

public class Point {
    float x = 0;
    float y = 0;

    Point() {}

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
