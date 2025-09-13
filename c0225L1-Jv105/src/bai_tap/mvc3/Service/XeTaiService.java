package bai_tap.mvc3.Service;
import bai_tap.mvc3.Entity.XeTai;
import bai_tap.mvc3.Repoitory.IXeTaiRepository;
import bai_tap.mvc3.Repoitory.XeTaiRepository;
import java.util.List;

public class XeTaiService implements IXeTaiService {
    private static IXeTaiRepository xeTaiRepository=new XeTaiRepository();

    @Override
    public List<XeTai> findAll() {
       return xeTaiRepository.findAll();
    }

    @Override
    public boolean add(XeTai xeTai) {
        List<XeTai> xeTais=xeTaiRepository.findAll();
        for (XeTai T : xeTais) {
            if (T.getBienKiemSoat().equals(xeTai.getBienKiemSoat())) {
                System.out.println("Biển số đã tồn tại: " + xeTai.getBienKiemSoat());
                return false;
            }
        }
        return xeTaiRepository.add(xeTai);
    }

    @Override
    public boolean delete(String bienKiemSoat) {
        XeTai xeTai = xeTaiRepository.findByBienKiemSoat(bienKiemSoat);
        if (xeTai == null) {
            System.out.println("Không tìm thấy biển số xe này = " + bienKiemSoat);
            return false;
        }
        return xeTaiRepository.delete(bienKiemSoat);
    }

    @Override
    public XeTai findByBienKiemSoat(String bienKiemSoat) {
        XeTai xeTai = xeTaiRepository.findByBienKiemSoat(bienKiemSoat);
        if (xeTai == null) {
            System.out.println("Không tìm thấy xe có biển số = " + bienKiemSoat);
        }
        return xeTai;
    }
}
