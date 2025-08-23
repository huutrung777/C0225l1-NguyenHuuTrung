package bai_tap.mvc3.Entity;

public class XeMay extends PhuongTien {
    private double CongSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        CongSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "CongSuat=" + CongSuat +
                '}';
    }
}
