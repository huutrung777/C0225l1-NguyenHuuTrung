package bai_tap.CaseStudy.Entity;

public abstract class Furama {
    private int MaDichVu;
    private String TenDichVu;
    private double dienTich;
    private double chiPhi;
    private int SoLuongNguoi;
    private String KieuThue;

    public Furama() {
    }

    public Furama(int maDichVu, String tenDichVu, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue) {
        MaDichVu = maDichVu;
        TenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        SoLuongNguoi = soLuongNguoi;
        KieuThue = kieuThue;
    }

    public int getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        MaDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        TenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuongNguoi() {
        return SoLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        SoLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return KieuThue;
    }

    public void setKieuThue(String kieuThue) {
        KieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "MaDichVu=" + MaDichVu +
                ", TenDichVu='" + TenDichVu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", SoLuongNguoi=" + SoLuongNguoi +
                ", KieuThue='" + KieuThue + '\'' +
                '}';
    }
}
