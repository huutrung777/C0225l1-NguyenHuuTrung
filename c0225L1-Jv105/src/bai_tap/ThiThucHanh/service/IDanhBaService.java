package bai_tap.ThiThucHanh.service;

import bai_tap.ThiThucHanh.entity.DanhBa;

import java.util.List;

public interface IDanhBaService {
List<DanhBa> getDanhBaList();
boolean addDanhBa(DanhBa danhBa);
void updateDanhBa(DanhBa danhBa);
void deleteDanhBa(DanhBa danhBa);

    boolean deleteDanhBa(String HoTen);

    void getDanhBa(String HoTen);
}
