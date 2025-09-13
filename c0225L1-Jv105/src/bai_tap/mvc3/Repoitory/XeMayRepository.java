package bai_tap.mvc3.Repoitory;
import bai_tap.mvc1.Utill.ReadAndWriteFile;
import bai_tap.mvc3.Entity.Oto;
import bai_tap.mvc3.Entity.XeMay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository{
    private final String XeMay_FILE="c0225L1-Jv105/src/bai_tap/mvc3/Data/XeMay.csv";
//private static  List<XeMay> xeMays = new ArrayList<>();
//static {
//    xeMays.add(new XeMay("92C1","HonDa",2003,"Trung",2000));
//    xeMays.add(new XeMay("92T1","HonDa",2002,"Ngân",7000));
//    xeMays.add(new XeMay("59X1","HuynhDa",1977,"Tâm",1000));
//}
    @Override
    public List<XeMay> findAll() {
        List<XeMay> xeMayList = new ArrayList<>();
        try {
            List<String> stringList= ReadAndWriteFile.readFileCSV(XeMay_FILE);
            String[] array=null;
            // chuyển đổi kiểu stringList thành studentList
            for(int i=0;i<stringList.size();i++){
                array=stringList.get(i).split(",");
                XeMay xeMay=new XeMay(array[0],array[1],Integer.parseInt(array[2]),array[3],Double.parseDouble(array[4]));
                xeMayList.add(xeMay);
            }
        } catch (IOException e) {
            System.out.println("đọc file bị lỗi ");
        }
        return xeMayList;
    }

    @Override
    public boolean add(XeMay xeMay) {
        List<String> list = new ArrayList<>();
        list.add(xeMay.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(XeMay_FILE,list,true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String bienKiemSoat) {
        boolean isSuccessDelete = false;
        List<XeMay> xeMayList = findAll();

        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeMayList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (XeMay xeMay : xeMayList) {
            stringList.add(xeMay.getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(XeMay_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }

    @Override
    public XeMay findByBienKiemSoat(String bienKiemSoat) {
        List<XeMay> xeMayList = findAll();
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeMay;
            }
        }
        return null;
    }
}
