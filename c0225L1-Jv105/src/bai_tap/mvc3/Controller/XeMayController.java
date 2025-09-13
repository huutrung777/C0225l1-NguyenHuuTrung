package bai_tap.mvc3.Controller;

import bai_tap.mvc3.Entity.XeMay;
import bai_tap.mvc3.Service.XeMayService;
import bai_tap.mvc3.View.OtoView;
import bai_tap.mvc3.View.XeMayView;

import java.util.ArrayList;
import java.util.List;

public class XeMayController {
    private XeMayService xeMayService = new XeMayService();



    public void addXeMay() {
        System.out.println("Thêm mới");
        XeMay xeMay = XeMayView.inputDataForNewXeMay();
        boolean isAddSuccess = xeMayService.add(xeMay);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }
    }

    public void displayXeMay() {
        List<XeMay> xeMayList = xeMayService.findAll();
        XeMayView.displayList(xeMayList);
    }
    public void deleteXeMay() {
        String bienSo = XeMayView.deleteBienSo();
        boolean ketQua = xeMayService.delete(bienSo);
        if (ketQua) {
            System.out.println("Xóa thành công Xe Máy có biển số " + bienSo);
        } else {
            System.out.println("Không tìm thấy Xe máy có biển số " + bienSo);
        }
    }
public void findXeMay() {
    String bienSo = XeMayView.searchXeMay();
    XeMay xeMay = xeMayService.findByBienKiemSoat(bienSo);
    if (xeMay != null) {
        System.out.println("Tìm thấy xe Máy:");
        List<XeMay> list = new ArrayList<>();
        list.add(xeMay);
        XeMayView.displayList(list);
    } else {
        System.out.println("Không tìm thấy Xe máy có biển số " + bienSo);
    }
}
}
