package bai_tap.mvc3.Entity;

public class XeTai extends PhuongTien {
    private double TrongTai;

    public XeTai() {
    }



    public double getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(double trongTai) {
        TrongTai = trongTai;
    }
    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat()+","+this.getTenHangSanXuat()+","+this.getNamSanXuat()+","+this.getChuSoHuu()+","+this.getTrongTai();
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        TrongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString()+
                "TrongTai=" + TrongTai +
                '}';
    }
}
