package bai_tap.mvc3.Service;
import bai_tap.mvc3.Entity.XeMay;
import bai_tap.mvc3.Repoitory.IXeMayRepository;
import bai_tap.mvc3.Repoitory.XeMayRepository;
import java.util.List;

public class XeMayService implements IXeMayService {
private static IXeMayRepository xeMayRepository=new XeMayRepository();

    @Override
    public List<XeMay> findAll() {
       return xeMayRepository.findAll();
    }

    @Override
    public  boolean add(XeMay xeMay) {
       List<XeMay> xeMays=xeMayRepository.findAll();
       for (XeMay M : xeMays) {
           if (M.getBienKiemSoat().equals(xeMay.getBienKiemSoat())) {
               System.out.println("Biển số đã tồn tại: " + xeMay.getBienKiemSoat());
               return false;
           }
       }
       return xeMayRepository.add(xeMay);
    }

    @Override
    public boolean delete(String bienKiemSoat) {
        XeMay xeMay = xeMayRepository.findByBienKiemSoat(bienKiemSoat);
        if (xeMay == null) {
            System.out.println("Không tìm thấy biển số xe này = " + bienKiemSoat);
            return false;
        }
        return xeMayRepository.delete(bienKiemSoat);
    }


    @Override
    public XeMay findByBienKiemSoat(String bienKiemSoat) {
        XeMay xeMay = xeMayRepository.findByBienKiemSoat(bienKiemSoat);
        if (xeMay == null) {
            System.out.println("Không tìm thấy xe có biển số = " + bienKiemSoat);
        }
        return xeMay;
    }
}
