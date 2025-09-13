package bai_tap.mvc3.Repoitory;

import bai_tap.mvc1.Utill.ReadAndWriteFile;
import bai_tap.mvc3.Entity.XeTai;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository {
    private final String XeTai_FILE = "c0225L1-Jv105/src/bai_tap/mvc3/Data/XeTai.csv";
    //    private static List<XeTai> xeTais = new ArrayList<>();
//    static {
//        xeTais.add(new XeTai("92C1","HonDa",2003,"Trung",2000));
//        xeTais.add(new XeTai("92T1","HonDa",2002,"Ngân",7000));
//        xeTais.add(new XeTai("59X1","HuynhDa",1977,"Tâm",1000));
//    }

    @Override
    public List<XeTai> findAll() {
        List<XeTai> xeTaiList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(XeTai_FILE);
            for (String line : stringList) {
                String[] array = line.split(",");
                XeTai xeTai = new XeTai(array[0], array[1], Integer.parseInt(array[2]),
                        array[3], Double.parseDouble(array[4]));
                xeTaiList.add(xeTai);
            }
        } catch (IOException e) {
            System.out.println("Đọc file bị lỗi!");
        }
        return xeTaiList;
    }

    @Override
    public boolean add(XeTai xeTai) {
        List<String> list = new ArrayList<>();
        list.add(xeTai.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(XeTai_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String bienKiemSoat) {
        boolean isSuccessDelete = false;
        List<XeTai> xeTaiList = findAll();

        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeTaiList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (XeTai xeTai : xeTaiList) {
            stringList.add(xeTai.getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(XeTai_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }

    @Override
    public XeTai findByBienKiemSoat(String bienKiemSoat) {
        List<XeTai> xeTaiList = findAll();
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeTai;
            }
        }
        return null;
    }
}
