package btThem.entity;

public class HangCheTao {
    private String MaHang;
    private String TenHang;
    private String QuocGia;

    public HangCheTao() {
    }

    public HangCheTao(String maHang, String tenHang, String quocGia) {
        MaHang = maHang;
        TenHang = tenHang;
        QuocGia = quocGia;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    @Override
    public String toString() {
        return "HangCheTao{" +
                "MaHang='" + MaHang + '\'' +
                ", TenHang='" + TenHang + '\'' +
                ", QuocGia='" + QuocGia + '\'' +
                '}';
    }
}
