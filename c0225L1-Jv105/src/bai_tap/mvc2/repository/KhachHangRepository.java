package bai_tap.mvc2.repository;

import bai_tap.mvc2.entity.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository implements IKhachHangRepository {
    private static List<KhachHang> khachHangs = new ArrayList<KhachHang>();
    static {
        khachHangs.add(new KhachHang(1,"Trung","trungll060@gmail.com","Điện Biên Phủ"));
        khachHangs.add(new KhachHang(2,"Tâm","tam060@gmail.com","Điện Biên Phủ"));
        khachHangs.add(new KhachHang(3,"Liên","lien060@gmail.com","Điện Biên Phủ"));
    }
    @Override
    public List<KhachHang> findAll() {
        return khachHangs;
    }

    @Override
    public boolean add(KhachHang khachHang) {
        khachHangs.add(khachHang);
        return true;
    }

    @Override
    public boolean delete(String id) {
        int intId = Integer.parseInt(String.valueOf(id));
        for (int i = 0; i < khachHangs.size(); i++) {
            if (khachHangs.get(i).getId() == intId) {
                khachHangs.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public KhachHang findById(String id) {
        int intId = Integer.parseInt(String.valueOf(id));
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getId() == intId) {
                return khachHang;
            }
        }
        return null;
    }
}
