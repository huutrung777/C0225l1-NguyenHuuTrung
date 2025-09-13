package bai_tap.mvc3.Repoitory;
import bai_tap.mvc3.Entity.XeMay;

import java.util.List;

public interface IXeMayRepository {
    List<XeMay> findAll();
    boolean add(XeMay xeMay);
    boolean delete(String bienKiemSoat);
    XeMay findByBienKiemSoat(String bienKiemSoat);

}
