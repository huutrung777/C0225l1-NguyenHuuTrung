package bai_tap.mvc2.service;

import bai_tap.mvc2.entity.khachHang;
import bai_tap.mvc2.repository.IkhachHangRepository;
import bai_tap.mvc2.repository.khachHangRepository;

import java.util.List;

public class khachHangService implements IkhachHangService {
    private IkhachHangRepository khachHangRepository=new khachHangRepository();


    @Override
    public List<khachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public boolean add(khachHang khachHang) {
        List<khachHang> khachHangs=khachHangRepository.findAll();
        for (int i = 0; i <khachHangs.size() ; i++) {
            if (khachHangs.get(i)!=null){
                if (khachHangs.get(i).getId()==khachHang.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }else {
                break;
            }

        }
        return khachHangRepository.add(khachHang);
    }

    @Override
    public boolean delete(String id) {
        khachHang khachHang = khachHangRepository.findById(id);
        if (khachHang == null) {
            System.out.println("Không tìm thấy sinh viên có id = " + id);
            return false;
        }
        return khachHangRepository.delete(id);
    }

    @Override
    public khachHang findById(String id) {
        khachHang khachHang = khachHangRepository.findById(id);
        if (khachHang == null) {
            System.out.println("Không tìm thấy sinh viên có id = " + id);
        }
        return khachHang;
    }
}
