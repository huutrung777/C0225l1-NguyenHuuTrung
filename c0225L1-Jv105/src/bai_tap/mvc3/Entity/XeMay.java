package bai_tap.mvc3.Entity;

public class XeMay extends PhuongTien {
    private double CongSuat;

    public XeMay() {
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(double congSuat) {
        CongSuat = congSuat;
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat()+","+this.getTenHangSanXuat()+","+this.getNamSanXuat()+","+this.getChuSoHuu()+","+this.getCongSuat();
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        CongSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                "CongSuat=" + CongSuat +
                '}';
    }
}
