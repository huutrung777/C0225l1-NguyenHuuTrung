package bai_tap.CaseStudy.Entity;

public class Customer extends Person {
    private String loaiKhach;
    private String Diachi;

    public Customer() {
    }

    public Customer(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, int soCMND, String soDienThoai, String email, String loaiKhach, String diachi) {
        super(maNhanVien, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.loaiKhach = loaiKhach;
        Diachi = diachi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "loaiKhach='" + loaiKhach + '\'' +
                ", Diachi='" + Diachi + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return getMaNhanVien() + "," + getHoTen() + "," + getNgaySinh() + "," + getGioiTinh() + ","
                + getSoCMND() + "," + getSoDienThoai() + "," + getEmail() + ","+getLoaiKhach()+","+getDiachi();
    }
}
