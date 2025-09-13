package bai_tap.mvc3.Controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        OtoController otoController = new OtoController();
        XeMayController xeMayController = new XeMayController();
        XeTaiController xeTaiController = new XeTaiController();

        boolean flag = true;
        while (flag) {
            System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG =====");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean addFlag = true;
                    while (addFlag) {
                        System.out.println("---- THÊM MỚI PHƯƠNG TIỆN ----");
                        System.out.println("1. Thêm Ô tô");
                        System.out.println("2. Thêm Xe máy");
                        System.out.println("3. Thêm Xe tải");
                        System.out.println("4. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int addChoice = Integer.parseInt(scanner.nextLine());
                        switch (addChoice) {
                            case 1:
                                otoController.addOto();
                                break;
                            case 2:
                                xeMayController.addXeMay();
                                break;
                            case 3:
                                xeTaiController.addXeTai();
                                break;
                            case 4:
                                addFlag = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ!");
                        }
                    }
                    break;

                case 2:
                    boolean displayFlag = true;
                    while (displayFlag) {
                        System.out.println("---- HIỂN THỊ PHƯƠNG TIỆN ----");
                        System.out.println("1. Hiển thị Ô tô");
                        System.out.println("2. Hiển thị Xe máy");
                        System.out.println("3. Hiển thị Xe tải");
                        System.out.println("4. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int displayChoice = Integer.parseInt(scanner.nextLine());
                        switch (displayChoice) {
                            case 1:
                                otoController.displayOto();
                                break;
                            case 2:
                                 xeMayController.displayXeMay();
                                break;
                            case 3:
                                 xeTaiController.displayXeTai();
                                break;
                            case 4:
                                displayFlag = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ!");
                        }
                    }
                    break;

                case 3:
                    boolean deleteFlag = true;
                    while (deleteFlag) {
                        System.out.println("---- XÓA PHƯƠNG TIỆN ----");
                        System.out.println("1. Xóa Ô tô");
                        System.out.println("2. Xóa Xe máy");
                        System.out.println("3. Xóa Xe tải");
                        System.out.println("4. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int deleteChoice = Integer.parseInt(scanner.nextLine());
                        switch (deleteChoice) {
                            case 1:
                                otoController.deleteOto();
                                break;
                            case 2:
                                 xeMayController.deleteXeMay();
                                break;
                            case 3:
                                 xeTaiController.deleteXeTai();
                                break;
                            case 4:
                                deleteFlag = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ!");
                        }
                    }
                    break;

                case 4:
                    boolean findFlag = true;
                    while (findFlag) {
                        System.out.println("---- TÌM KIẾM PHƯƠNG TIỆN ----");
                        System.out.println("1. Tìm Ô tô");
                        System.out.println("2. Tìm Xe máy");
                        System.out.println("3. Tìm Xe tải");
                        System.out.println("4. Quay lại");
                        System.out.print("Nhập lựa chọn: ");
                        int findChoice = Integer.parseInt(scanner.nextLine());
                        switch (findChoice) {
                            case 1:
                                otoController.findOto();
                                break;
                            case 2:
                                 xeMayController.findXeMay();
                                break;
                            case 3:
                                 xeTaiController.findXeTai();
                                break;
                            case 4:
                                findFlag = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ!");
                        }
                    }
                    break;


                case 5:
                    flag = false;
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
