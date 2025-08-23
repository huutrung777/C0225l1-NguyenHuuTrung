package bai_tap.mvc2.service;

import bai_tap.mvc2.entity.KhachHang;
import bai_tap.mvc2.repository.IKhachHangRepository;
import bai_tap.mvc2.repository.KhachHangRepository;

import java.util.List;

public class KhachHangService implements IKhachHangService {
    private IKhachHangRepository khachHangRepository=new KhachHangRepository();


    @Override
    public List<KhachHang> findAll()
    {
        return khachHangRepository.findAll();
    }

    @Override
    public boolean add(KhachHang khachHang) {
        List<KhachHang> khachHangs=khachHangRepository.findAll();
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
        KhachHang khachHang = khachHangRepository.findById(id);
        if (khachHang == null) {
            System.out.println("Không tìm thấy sinh viên có id = " + id);
            return false;
        }
        return khachHangRepository.delete(id);
    }

    @Override
    public KhachHang findById(String id) {
        KhachHang khachHang = khachHangRepository.findById(id);
        if (khachHang == null) {
            System.out.println("Không tìm thấy sinh viên có id = " + id);
        }
        return khachHang;
    }
}
