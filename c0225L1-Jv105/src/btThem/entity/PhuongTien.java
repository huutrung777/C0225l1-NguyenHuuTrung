package btThem.entity;

public class PhuongTien {
    private String soHieu;
    private String tenHang;
    private int namSX;
    private String nguoiDieuPhoi;

    public PhuongTien() {
    }

    public PhuongTien(String soHieu, String tenHang, int namSX, String nguoiDieuPhoi) {
        this.soHieu = soHieu;
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getNguoiDieuPhoi() {
        return nguoiDieuPhoi;
    }

    public void setNguoiDieuPhoi(String nguoiDieuPhoi) {
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "soHieu='" + soHieu + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", namSX=" + namSX +
                ", nguoiDieuPhoi='" + nguoiDieuPhoi + '\'' +
                '}';
    }
}
