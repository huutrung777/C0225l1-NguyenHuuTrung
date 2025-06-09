package bai_tap.bai8.entity;

public abstract class PhuongTienGiaoThong {
    String BienkiemSoat;
    String TenHangSX;
    int NamSX;
    String ChuSoHuu;

    public PhuongTienGiaoThong(String bienkiemSoat, String tenHangSX, int namSX, String chuSoHuu) {
        BienkiemSoat = bienkiemSoat;
        TenHangSX = tenHangSX;
        NamSX = namSX;
        ChuSoHuu = chuSoHuu;
    }

    public String getBienkiemSoat() {
        return BienkiemSoat;
    }

    public void setBienkiemSoat(String bienkiemSoat) {
        BienkiemSoat = bienkiemSoat;
    }

    public String getTenHangSX() {
        return TenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        TenHangSX = tenHangSX;
    }

    public int getNamSX() {
        return NamSX;
    }

    public void setNamSX(int namSX) {
        NamSX = namSX;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "BienkiemSoat='" + BienkiemSoat + '\'' +
                ", TenHangSX='" + TenHangSX + '\'' +
                ", NamSX=" + NamSX +
                ", ChuSoHuu='" + ChuSoHuu + '\'' +
                '}';
    }
}

