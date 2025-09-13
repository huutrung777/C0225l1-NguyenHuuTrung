package bai_tap.mvc3.Controller;

import bai_tap.mvc1.entity.Student;
import bai_tap.mvc1.view.StudentView;
import bai_tap.mvc3.Entity.Oto;
import bai_tap.mvc3.Service.IOtoService;
import bai_tap.mvc3.Service.OtoService;
import bai_tap.mvc3.View.OtoView;

import java.util.ArrayList;
import java.util.List;

public class OtoController {
    private IOtoService otoService = new OtoService();


    public void addOto() {
        System.out.println("Thêm mới");
        Oto oto = OtoView.inputDataForNewOto();
        boolean isAddSuccess = otoService.add(oto);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }

    }


    public void displayOto() {
        List<Oto> otoList = otoService.findAll();
        OtoView.displayList(otoList);
    }


    public void deleteOto() {
        String bienSo = OtoView.deleteBienSo();
        boolean ketQua = otoService.delete(bienSo);
        if (ketQua) {
            System.out.println("Xóa thành công ô tô có biển số " + bienSo);
        } else {
            System.out.println("Không tìm thấy ô tô có biển số " + bienSo);
        }
    }


    public void findOto() {
        String bienSo = OtoView.searchOto();
        Oto oto = otoService.findByBienKiemSoat(bienSo);
        if (oto != null) {
            System.out.println("Tìm thấy ô tô:");
            List<Oto> list = new ArrayList<>();
            list.add(oto);
            OtoView.displayList(list);
        } else {
            System.out.println("Không tìm thấy ô tô có biển số " + bienSo);
        }
    }
}
