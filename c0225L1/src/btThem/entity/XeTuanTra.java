package btThem.entity;

public class XeTuanTra extends PhuongTien {
    private int khaNangChongBX;

    public XeTuanTra() {
    }

    public XeTuanTra(int khaNangChongBX) {
        this.khaNangChongBX = khaNangChongBX;
    }

    public XeTuanTra(String soHieu, String tenHang, int namSX, String nguoiDieuPhoi, int khaNangChongBX) {
        super(soHieu, tenHang, namSX, nguoiDieuPhoi);
        this.khaNangChongBX = khaNangChongBX;
    }

    public int getKhaNangChongBX() {
        return khaNangChongBX;
    }

    public void setKhaNangChongBX(int khaNangChongBX) {
        this.khaNangChongBX = khaNangChongBX;
    }

    @Override
    public String toString() {
        return "XeTuanTra{" +
                "khaNangChongBX=" + khaNangChongBX +
                '}';
    }
}
