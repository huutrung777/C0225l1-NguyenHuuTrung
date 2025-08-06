package bai_tap.ThiThucHanh.repository;

import bai_tap.ThiThucHanh.entity.DanhBa;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DanhBaRepository {
    private static List<DanhBa> danhBas = new ArrayList<>();
    private static final String DanhBa_FILE_PATH = "src/bai_tap/ThiThucHanh/data/DanhSach.csv";
public DanhBaRepository() {readFile();}
    private void readFile() {
        File file = new File(DanhBa_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(DanhBa_FILE_PATH))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                if (line.trim().isEmpty() || line.trim().startsWith("//")) {
                    continue;
                }

                String[] data = line.split(",");
                if (data.length == 5) {
                    try {
                        DanhBa danhBa = new DanhBa(
                                data[0],
                                Integer.parseInt(data[1]),
                                data[2],
                                data[3],
                                data[4]
                        );
                        danhBas.add(danhBa);
                    } catch (NumberFormatException e) {
                        System.out.println("Dữ liệu không đúng định dạng " + e.getMessage());
                    }
                } else {
                    System.out.println("Dòng không hợp lệ " + line);
                }
            }
        }catch (IOException e) {
            System.out.println("Lỗi đọc file " + e.getMessage());
        }
    }
    private void saveFile() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(DanhBa_FILE_PATH))) {
            for (DanhBa danhBa : danhBas ) {
                bw.write(String.format("%s,%d,%s,%s,%s",
                        danhBa.getHoTen(),
                        danhBa.getSoDT(),
                        danhBa.getDiaChi(),
                        danhBa.getEmail(),
                        danhBa.getFacebook()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }
    public boolean addDanhBa(DanhBa danhBa) {
        for (DanhBa DB : danhBas) {
            if (DB.getHoTen().equals(danhBa.getHoTen())) {
                return false;
            }
        }
        danhBas.add(danhBa);
        saveFile();
        return true;
    }
    public boolean deleteDanhBa(String HoTen) {
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getHoTen().equals(HoTen)) {
                danhBas.remove(i);
                saveFile();
                return true;
            }
        }
        return false;
    }
    public List<DanhBa> getDanhBaList() {
        return new ArrayList<>(danhBas);
    }
    public boolean updateDrone(String HoTen, DanhBa danhBa) {
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getHoTen().equals(HoTen)) {
                danhBas.set(i, danhBa);
                saveFile();
                return true;
            }
        }
        return false;
    }
    public DanhBa getDanhBa(String HoTen) {
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getHoTen().equals(HoTen)) {
                return danhBas.get(i);
            }
        }
        return null;
    }



}
