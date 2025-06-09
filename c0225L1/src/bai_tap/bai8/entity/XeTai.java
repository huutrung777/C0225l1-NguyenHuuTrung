package bai_tap.bai8.entity;

public class XeTai extends PhuongTienGiaoThong {
    private double TrongTai;

    public XeTai(String bienkiemSoat, String tenHangSX, int namSX, String chuSoHuu, double trongTai) {
        super(bienkiemSoat, tenHangSX, namSX, chuSoHuu);
        TrongTai = trongTai;
    }

    public double getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(double trongTai) {
        TrongTai = trongTai;
    }


}
