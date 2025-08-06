package bai_tap.bai8.entity;

public class Motor extends PTGT {
    private double congSuat;
    public Motor() {}

    public Motor(double congSuat) {
        this.congSuat = congSuat;
    }

    public Motor(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "congSuat=" + congSuat +
                '}';
    }
}
