package bai_tap.mvc3.Service;

import bai_tap.mvc3.Entity.Oto;

import java.util.List;

public interface IOtoService {
    List<Oto> findAll();
    boolean add(Oto oto);
    boolean delete(String bienKiemSoat);
    Oto findByBienKiemSoat(String bienKiemSoat);
}
