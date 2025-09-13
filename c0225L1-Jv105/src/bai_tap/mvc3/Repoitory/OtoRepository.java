package bai_tap.mvc3.Repoitory;

import bai_tap.mvc1.Utill.ReadAndWriteFile;
import bai_tap.mvc1.entity.Student;
import bai_tap.mvc3.Entity.Oto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private final String OTO_FILE="c0225L1-Jv105/src/bai_tap/mvc3/Data/Oto.csv";
//    private static  List<Oto> otos = new ArrayList<>();
//    static {
//        otos.add(new Oto("92C1","HonDa",2003,"Trung",4,"Xe nhỏ"));
//        otos.add(new Oto("59N1","HuynhDa",2002,"Ngân",7,"Xe Lớn"));
//        otos.add(new Oto("51T1","Porcher",1977,"Tâm",2,"Siêu Xe"));
//
//    }
    @Override
    public List<Oto> findAll() {
        List<Oto> otoList = new ArrayList<>();
        try {
            List<String> stringList= ReadAndWriteFile.readFileCSV(OTO_FILE);
            String[] array=null;
            // chuyển đổi kiểu stringList thành studentList
            for(int i=0;i<stringList.size();i++){
                array=stringList.get(i).split(",");
                Oto oto=new Oto(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5] );
                otoList.add(oto);
            }
        } catch (IOException e) {
            System.out.println("đọc file bị lỗi ");
        }
        return otoList;

    }

    @Override
    public boolean add(Oto oto) {
        List<String> list = new ArrayList<>();
        list.add(oto.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(OTO_FILE,list,true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }
    @Override
    public boolean delete(String bienKiemSoat) {
        boolean isSuccessDelete = false;
        List<Oto> otoList = findAll();

        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                otoList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Oto oto : otoList) {
            stringList.add(oto.getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(OTO_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }

    @Override
    public Oto findByBienKiemSoat(String bienKiemSoat) {
        List<Oto> otoList = findAll();
        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                return oto;
            }
        }
        return null;
    }
}

