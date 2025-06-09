package bai_tap.bai8.entity;

public class XeMay extends PhuongTienGiaoThong{
    private double CongSuat;

    public XeMay(String bienkiemSoat, String tenHangSX, int namSX, String chuSoHuu, double congSuat) {
        super(bienkiemSoat, tenHangSX, namSX, chuSoHuu);
        CongSuat = congSuat;
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(double congSuat) {
        CongSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "CongSuat=" + CongSuat +
                '}';
    }
}
