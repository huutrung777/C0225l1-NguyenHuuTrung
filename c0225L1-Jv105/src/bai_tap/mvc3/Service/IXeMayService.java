package bai_tap.mvc3.Service;

import bai_tap.mvc3.Entity.XeMay;

import java.util.List;

public interface IXeMayService {
    List<XeMay> findAll();
    boolean add(XeMay xeMay);
    boolean delete(String bienKiemSoat);
    XeMay findByBienKiemSoat(String bienKiemSoat);

}
