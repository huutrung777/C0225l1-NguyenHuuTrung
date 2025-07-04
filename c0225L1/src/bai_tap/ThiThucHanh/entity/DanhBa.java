package bai_tap.ThiThucHanh.entity;

public class DanhBa {
    private String hoTen;
    private int soDT;
    private String DiaChi;
    private String Email;
    private String Facebook;

    public DanhBa() {
    }

    public DanhBa(String hoTen, int soDT, String diaChi, String email, String facebook) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        DiaChi = diaChi;
        Email = email;
        Facebook = facebook;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "hoTen='" + hoTen + '\'' +
                ", soDT=" + soDT +
                ", DiaChi='" + DiaChi + '\'' +
                ", Email='" + Email + '\'' +
                ", Facebook='" + Facebook + '\'' +
                '}';
    }
}
