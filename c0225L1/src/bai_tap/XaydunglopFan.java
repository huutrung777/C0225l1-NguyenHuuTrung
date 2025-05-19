package bai_tap;
// Lớp mô tả cái quạt
class Fan {
    // Các hằng số để biểu thị tốc độ
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính
    private int speed;       // tốc độ quạt
    private boolean on;      // trạng thái bật/tắt
    private double radius;   // bán kính
    private String color;    // màu sắc

    // Hàm khởi tạo không tham số
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // Getter và Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString mô tả thông tin quạt
    public String toString() {
        if (on) {
            return "Fan is on - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off - Color: " + color + ", Radius: " + radius;
        }
    }
}

public class XaydunglopFan {
    public static void main(String[] args) {
        // Tạo đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);      // tốc độ nhanh nhất
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);             // bật quạt

        // Tạo đối tượng Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);    // tốc độ trung bình
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);            // tắt quạt

        // Hiển thị thông tin
        System.out.println("Quạt 1: " + fan1.toString());
        System.out.println("Quạt 2: " + fan2.toString());
}
}
