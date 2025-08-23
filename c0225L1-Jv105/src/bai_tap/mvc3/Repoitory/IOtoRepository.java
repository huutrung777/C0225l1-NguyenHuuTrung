package bai_tap.mvc3.Repoitory;

import bai_tap.mvc3.Entity.Oto;

import java.util.List;

public interface IOtoRepository {
    List<Oto> findAll();
    boolean add(Oto oto);
    boolean delete(String bienKiemSoat);
    Oto findByBienKiemSoat(String bienKiemSoat);


}
