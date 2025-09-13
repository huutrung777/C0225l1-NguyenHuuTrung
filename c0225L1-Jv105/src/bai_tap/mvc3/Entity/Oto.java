package bai_tap.mvc3.Entity;

public class Oto extends PhuongTien {
    private int soChoNGoi;
    private String kieuXe;

    public Oto() {
    }

    public int getSoChoNGoi() {
        return soChoNGoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public void setSoChoNGoi(int soChoNGoi) {
        this.soChoNGoi = soChoNGoi;
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat()+","+this.getTenHangSanXuat()+","+this.getNamSanXuat()+","+this.getChuSoHuu()+","+this.getSoChoNGoi()+","+this.getKieuXe();
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNGoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNGoi = soChoNGoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
        super.toString()+
        "soChoNGoi=" + soChoNGoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
