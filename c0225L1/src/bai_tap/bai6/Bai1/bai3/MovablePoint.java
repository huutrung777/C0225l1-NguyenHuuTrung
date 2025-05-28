package bai_tap.bai6.Bai1.bai3;

public class MovablePoint extends Point {
    float xSpeed = 0;
    float ySpeed = 0;

    MovablePoint() {}

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public String toString() {
        return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
