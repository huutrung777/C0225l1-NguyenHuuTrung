package bai_tap.ThiThucHanh.controller;

import bai_tap.ThiThucHanh.entity.DanhBa;
import bai_tap.ThiThucHanh.service.DanhBaService;
import bai_tap.ThiThucHanh.service.IDanhBaService;

import java.util.List;

public class DanhBaController {
private IDanhBaService danhBaService;
public List<DanhBa> getDanhBa() {return danhBaService.getDanhBaList();}
public void DeleteDanhBa(DanhBa danhBa) {danhBaService.deleteDanhBa(danhBa);}
public void updateDanhBa(DanhBa danhBa) {danhBaService.updateDanhBa(danhBa);}
public void getDanhBa(DanhBa danhBa) {danhBaService.getDanhBa(danhBa.getHoTen());}

    public void addDanhBa(DanhBa danhBa) {danhBaService.addDanhBa(danhBa);}
}
