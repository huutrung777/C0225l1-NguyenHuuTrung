package bai_tap.mvc3.Service;

import bai_tap.mvc3.Entity.XeTai;

import java.util.List;

public interface IXeTaiService {
    List<XeTai> findAll();
    boolean add(XeTai xeTai);
    boolean delete(String bienKiemSoat);
    XeTai findByBienKiemSoat(String bienKiemSoat);

}
