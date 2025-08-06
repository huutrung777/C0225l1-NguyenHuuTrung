package btThem.entity;

public class Drone extends PhuongTien {
    private int tamBayToiDa;

    public Drone(String soHieu, String spaceX, String number, String nguyễnVănA, String id) {
    }

    public Drone(String datum, String s, int tamBayToiDa, String string, int i, String datum1) {
        this.tamBayToiDa = tamBayToiDa;
    }

    public Drone(String soHieu, String tenHang, int namSX, String nguoiDieuPhoi, int tamBayToiDa) {
        super(soHieu, tenHang, namSX, nguoiDieuPhoi);
        this.tamBayToiDa = tamBayToiDa;
    }

    public int getTamBayToiDa() {
        return tamBayToiDa;
    }

    public void setTamBayToiDa(int tamBayToiDa) {
        this.tamBayToiDa = tamBayToiDa;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "tamBayToiDa=" + tamBayToiDa +
                '}';
    }
}
