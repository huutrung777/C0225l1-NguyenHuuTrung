package bai_tap.mvc3.Repoitory;


import bai_tap.mvc3.Entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    List<XeTai> findAll();
    boolean add(XeTai xeTai);
    boolean delete(String bienKiemSoat);
    XeTai findByBienKiemSoat(String bienKiemSoat);

}
