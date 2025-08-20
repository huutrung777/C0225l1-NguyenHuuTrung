package bai_tap.mvc2.repository;

import bai_tap.mvc2.entity.khachHang;

import java.util.ArrayList;
import java.util.List;

public class khachHangRepository implements IkhachHangRepository {
    private static List<khachHang> khachHangs = new ArrayList<khachHang>();
    static {
        khachHangs.add(new khachHang(1,"Trung","trungll060@gmail.com","Điện Biên Phủ"));
        khachHangs.add(new khachHang(2,"Tâm","tam060@gmail.com","Điện Biên Phủ"));
        khachHangs.add(new khachHang(3,"Liên","lien060@gmail.com","Điện Biên Phủ"));
    }
    @Override
    public List<khachHang> findAll() {
        return khachHangs;
    }

    @Override
    public boolean add(khachHang khachHang) {
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
    public khachHang findById(String id) {
        int intId = Integer.parseInt(String.valueOf(id));
        for (khachHang khachHang : khachHangs) {
            if (khachHang.getId() == intId) {
                return khachHang;
            }
        }
        return null;
    }
}
