package bai_tap.ThiThucHanh.service;

import bai_tap.ThiThucHanh.entity.DanhBa;

import java.util.List;

public class DanhBaService implements IDanhBaService {
private static DanhBaService danhbaRepository = new DanhBaService();



    @Override
    public List<DanhBa> getDanhBaList() {
return danhbaRepository.getDanhBaList();
    }

    @Override
    public boolean addDanhBa(DanhBa danhBa) {
if (danhbaRepository.addDanhBa(danhBa)){
    System.out.println("Thêm mới thanh cong");
}else {
    System.out.println("Đã tồn tại số hiệu này");
}

        return false;
    }

    @Override
    public void updateDanhBa(DanhBa danhBa) {

    }

    @Override
    public void deleteDanhBa(DanhBa danhBa) {

    }

    @Override
    public boolean deleteDanhBa(String HoTen) {
        if (danhbaRepository.deleteDanhBa(HoTen)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy số hiệu này");
        }


        return false;
    }

    @Override
    public void getDanhBa(String HoTen) {

    }
}
