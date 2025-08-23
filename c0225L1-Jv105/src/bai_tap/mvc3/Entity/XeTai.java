package bai_tap.mvc3.Entity;

public class XeTai extends PhuongTien {
    private double TrongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        TrongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "TrongTai=" + TrongTai +
                '}';
    }
}
