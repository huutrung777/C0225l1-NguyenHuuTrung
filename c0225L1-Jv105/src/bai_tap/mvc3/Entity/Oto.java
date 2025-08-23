package bai_tap.mvc3.Entity;

public class Oto extends PhuongTien {
    private int soChoNGoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNGoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNGoi = soChoNGoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNGoi=" + soChoNGoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
