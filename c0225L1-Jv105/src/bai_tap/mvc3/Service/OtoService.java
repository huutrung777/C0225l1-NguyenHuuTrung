package bai_tap.mvc3.Service;
import bai_tap.mvc3.Entity.Oto;
import bai_tap.mvc3.Repoitory.IOtoRepository;
import bai_tap.mvc3.Repoitory.OtoRepository;

import java.util.List;

public class OtoService implements IOtoService {
    private static IOtoRepository otoRepository=new OtoRepository();

    @Override
    public List<Oto> findAll() {
        return otoRepository.findAll();
    }


    @Override
    public boolean add(Oto oto) {
        List<Oto> otos = otoRepository.findAll();
        for (Oto o : otos) {
            if (o.getBienKiemSoat().equalsIgnoreCase(oto.getBienKiemSoat())) {
                System.out.println("Biển số đã tồn tại: " + oto.getBienKiemSoat());
                return false;
            }
        }
        return otoRepository.add(oto);
    }


    @Override
    public boolean delete(String bienKiemSoat) {
        return otoRepository.delete(bienKiemSoat);
    }

    @Override
    public Oto findByBienKiemSoat(String bienKiemSoat) {
        Oto oto = otoRepository.findByBienKiemSoat(bienKiemSoat);
        if (oto == null) {
            System.out.println("Không tìm thấy xe có biển số = " + bienKiemSoat);
        }
        return oto;
    }
}
