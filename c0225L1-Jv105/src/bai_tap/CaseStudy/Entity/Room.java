package bai_tap.CaseStudy.Entity;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(int maDichVu, String tenDichVu, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String dichVuMienPhi) {
        super(maDichVu, tenDichVu, dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }
}
