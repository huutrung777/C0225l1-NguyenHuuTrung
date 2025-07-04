package btThem.repository;

import btThem.entity.Drone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DroneRepository {
    private static List<Drone> drones = new ArrayList<>();
    private static final String Drone_FILE_PATH = "src/btThem/data/drone.csv";
//static {
//    drones.add(new Drone("DRN-001", "SpaceX", "2032", "Nguyễn Văn A", "1200"));
//
//}
public DroneRepository() {readFile();}
private void readFile() {
    File file = new File(Drone_FILE_PATH);
    if (!file.exists()) {
        try{
            file.createNewFile();
        }catch (IOException e) {
            System.out.println("Lỗi khi đọc file " + e.getMessage());
        }
    }

    try (BufferedReader br = new BufferedReader(new FileReader(Drone_FILE_PATH))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 6) {
                try {
                    Drone drone = new Drone(
                            data[0],
                            data[1],
                            Integer.parseInt(data[2]),
                            data[3],
                            Integer.parseInt(data[4]),
                            data[5]
                    );
                    drones.add(drone);
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
//    private void saveFile() {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Drone_FILE_PATH))) {
//            for (Drone drone : drones) {
//                // Viết đúng định dạng có dấu cách sau dấu phẩy
//                String dong = String.format("%s, %s, %d, %s, %d",
//                        drone.getSoHieu(),
//                        drone.getTenHang(),
//                        drone.getNamSX(),
//                        drone.getNguoiDieuPhoi(),
//                        drone.getTamBayToiDa()
//                );
//                bw.write(dong);
//                bw.newLine(); // Xuống dòng
//            }
//            System.out.println("✅ Đã lưu danh sách drone vào file: " + Drone_FILE_PATH);
//        } catch (IOException e) {
//            System.out.println("❌ Lỗi khi ghi file: " + e.getMessage());
//        }
//    }
}
}
