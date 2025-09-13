package bai_tap.mvc3.Controller;

import bai_tap.mvc3.Entity.Oto;
import bai_tap.mvc3.Entity.XeMay;
import bai_tap.mvc3.Entity.XeTai;
import bai_tap.mvc3.Service.XeTaiService;
import bai_tap.mvc3.View.OtoView;
import bai_tap.mvc3.View.XeMayView;
import bai_tap.mvc3.View.XeTaiView;

import java.util.ArrayList;
import java.util.List;

public class XeTaiController {
    private XeTaiService xeTaiService=new XeTaiService();
    public void addXeTai() {
        System.out.println("Thêm mới");
        XeTai xeTai = XeTaiView.inputDataForNewXeTai();
        boolean isAddSuccess = xeTaiService.add(xeTai);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }
    }
    public void displayXeTai() {
        List<XeTai> xeTaiList = xeTaiService.findAll();
        XeTaiView.displayList(xeTaiList);
    }
    public void deleteXeTai() {
        String bienSo = XeTaiView.deleteBienSo();
        boolean ketQua = xeTaiService.delete(bienSo);
        if (ketQua) {
            System.out.println("Xóa thành công Xe Tải có biển số " + bienSo);
        } else {
            System.out.println("Không tìm thấy Xe Tải có biển số " + bienSo);
        }
    }
    public void findXeTai() {
        String bienSo = XeTaiView.searchXeTai();
        XeTai xeTai = xeTaiService.findByBienKiemSoat(bienSo);
        if (xeTai != null) {
            System.out.println("Tìm thấy Xe tải:");
            List<XeTai> list = new ArrayList<>();
            list.add(xeTai);
            XeTaiView.displayList(list);
        } else {
            System.out.println("Không tìm thấy Xe tải có biển số " + bienSo);
        }
    }

}
