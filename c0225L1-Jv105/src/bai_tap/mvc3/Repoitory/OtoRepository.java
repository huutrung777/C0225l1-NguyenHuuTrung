package bai_tap.mvc3.Repoitory;

import bai_tap.mvc3.Entity.Oto;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private static List<Oto> otos = new ArrayList<Oto>();
    static {
        otos.add(new Oto("92C1","HonDa",2003,"Trung",4,"Xe nhỏ"));
        otos.add(new Oto("59N1","HuynhDa",2002,"Ngân",7,"Xe Lớn"));
        otos.add(new Oto("51T1","Porcher",1977,"Tâm",2,"Siêu Xe"));

    }
    @Override
    public List<Oto> findAll() {
        return otos;
    }

    @Override
    public boolean add(Oto oto) {
        return otos.add(oto);
    }

    @Override
    public boolean delete(String bienKiemSoat) {
        for (Oto oto : otos) {
            if (oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                otos.remove(oto);
                return true;
            }
        }
        return false;

    }

    @Override
    public Oto findByBienKiemSoat(String bienKiemSoat) {
        for (Oto oto : otos) {
            if (oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return oto;
            }
        }
        return null;
    }


}
