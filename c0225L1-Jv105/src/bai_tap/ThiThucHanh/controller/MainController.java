package bai_tap.ThiThucHanh.controller;

import bai_tap.ThiThucHanh.entity.DanhBa;
import bai_tap.ThiThucHanh.view.MainView;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static MainView view = new MainView();
    private static MainController danhBaController = new MainController();
    static DanhBaController tc = new DanhBaController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean flag = true;
        while (flag) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    view.listMenu();
                    break;
                case 2:
                    view.addMenu();
                    break;
                case 3:
                    view.UpMenu();
                    break;
                case 4:
                    view.deleteMenu();
                    break;
                case 5:
                view.searchMenu();
                break;
                case 6:
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }


        }
    }
    public static boolean listMenu() {
        boolean flag2 = true;
        while (flag2) {
            int choice = view.listMenu();
            switch (choice) {
                case 1:
                    getDanhBaList();
                    break;
                case 2:
                    flag2 = false;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");

            }

        }
        return true;
    }
public static boolean addMenu() throws ParseException {
boolean flag3 = true;
while (flag3) {
int choice = view.addMenu();
switch (choice) {
    case 1:addDanhBa();
break;
case 2:
    flag3 = false;
    default:
        System.out.println("Không có lựa chọn này, hãy nhập lại");
    }
}
return true;
}

    private static void addDanhBa() {
        System.out.println("=============================");
        System.out.println("Nhập hoten");
        String newhoTen = sc.nextLine();
        System.out.println("nhập sđt");
        int newsoDT = sc.nextInt();
        System.out.println("Nhập Địa chỉ");
        String newDiaChi = sc.nextLine();
        System.out.println("Nhập email");
        String newEmail = sc.nextLine();
        System.out.println("Nhập FB");
        String newFB = sc.nextLine();
        tc.addDanhBa(new DanhBa(newhoTen,newsoDT,newDiaChi,newEmail,newFB));
    }
    private static void getDanhBaList() {
        System.out.println("------LIST Danh Ba-----");
        List<DanhBa> danhBas = tc.getDanhBa();
        for (DanhBa danhBa : danhBas) {
            System.out.println(danhBa);
        }
    }
}