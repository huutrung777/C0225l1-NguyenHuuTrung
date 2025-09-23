package bai_tap.CaseStudy.Entity;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(int maDichVu, String tenDichVu, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
