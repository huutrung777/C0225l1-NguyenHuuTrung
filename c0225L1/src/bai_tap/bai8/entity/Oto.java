package bai_tap.bai8.entity;

public class Oto extends PhuongTienGiaoThong {
    private int SoChoNgoi;
    private String KieuXe;

    public Oto(String bienkiemSoat, String tenHangSX, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienkiemSoat, tenHangSX, namSX, chuSoHuu);
        SoChoNgoi = soChoNgoi;
        KieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return KieuXe;
    }

    public void setKieuXe(String kieuXe) {
        KieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "SoChoNgoi=" + SoChoNgoi +
                ", KieuXe='" + KieuXe + '\'' +
                '}';
    }
}
