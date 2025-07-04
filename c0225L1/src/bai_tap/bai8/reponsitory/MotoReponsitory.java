package bai_tap.bai8.reponsitory;

import bai_tap.bai8.entity.Motor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotoReponsitory {
private static List<Motor>motors = new ArrayList<Motor>();
    private static String MOTORS_FILE_PATH="bai_tap/bai8/data/Moto.csv";
    public MotoReponsitory() {readFile();}
private void readFile() {
File file = new File(MOTORS_FILE_PATH);
if (!file.exists()) {
try{
    file.createNewFile();

}catch(Exception e){
    System.out.println("Lỗi khi đọc file " + e.getMessage());
        }
    }
    try (BufferedReader br = new BufferedReader(new FileReader(MOTORS_FILE_PATH))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 6) {
                try {
                    Motor motor = new Motor(
                            data[0],
                            data[1],
                            data[2],
                            data[3],
                            Double.parseDouble(data[4])
                    );
                    motors.add(motor);
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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(MOTORS_FILE_PATH))) {
            for (Motor motor : motors) {
                bw.write(String.format("%s,%s,%s,%s,%d,%s",
                        motor.getBienKiemSoat(),
                        motor.getTenHangSanXuat(),
                        motor.getNamSanXuat(),
                        motor.getChuSoHuu(),
                        motor.getCongSuat()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public boolean addMotor (Motor motor){
        for (Motor motor1 : motors) {
            if (motor1.getBienKiemSoat().equals(motor.getBienKiemSoat())) {
                return false;
            }
        }
        motors.add(motor);
        saveFile();
        return true;
    }

    public List<Motor> findALlMotors(){
        return new ArrayList<>(motors);
    }

    public boolean deleteMotor(String id){
//        for (Motor motor : motors){
//            if (motor.getBienKiemSoat().equals(id)){
//                motors.remove(motor);
//            }
//        }
        boolean removed = motors.removeIf(motor -> motor.getBienKiemSoat().equals(id));
        saveFile();
        return removed;
    }

    public boolean updateMotor(String id, Motor motor){
//        for (Motor motor2 : motors){
//            if (motor2.getBienKiemSoat().equals(id)){
//                motor2.setBienKiemSoat(motor.getBienKiemSoat());
//                motor2.setTenHangSanXuat(motor.getTenHangSanXuat());
//                motor2.setNamSanXuat(motor.getNamSanXuat());
//                motor2.setChuSoHuu(motor.getChuSoHuu());
//                motor2.setCongSuat(motor.getCongSuat());
//            }
//        }
        for (int i = 0; i < motors.size(); i++) {
            if (motors.get(i).getBienKiemSoat().equals(id)) {
                motors.set(i, motor);
                saveFile();
                return true;
            }
        }
        return false;

}
}
