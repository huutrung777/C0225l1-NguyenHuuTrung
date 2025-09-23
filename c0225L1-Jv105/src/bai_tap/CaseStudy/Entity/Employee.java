package bai_tap.CaseStudy.Entity;

public class Employee extends Person {

    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, int soCMND, String soDienThoai, String email, String trinhDo, String viTri, double luong) {
        super(maNhanVien, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getInfoToCSV() {
        return getMaNhanVien() + "," + getHoTen() + "," + getNgaySinh() + "," + getGioiTinh() + ","
                + getSoCMND() + "," + getSoDienThoai() + "," + getEmail() + ","
                + getTrinhDo() + "," + getViTri() + "," + getLuong();
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
