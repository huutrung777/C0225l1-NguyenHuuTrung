package bai_tap.bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Thêm 2.Sửa 3.Xoá 4.Xem 5.Tìm 6.Tăng 7.Giảm 0.Thoát");
            System.out.print("Chọn: ");
            int c = sc.nextInt();
            sc.nextLine();

            switch (c) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = sc.nextDouble();
                    pm.add(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("ID sửa: ");
                    int idEdit = sc.nextInt(); sc.nextLine();
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = sc.nextDouble();
                    pm.edit(idEdit, newName, newPrice);
                    break;
                case 3:
                    System.out.print("ID xoá: ");
                    int idDel = sc.nextInt();
                    pm.delete(idDel);
                    break;
                case 4:
                    pm.show();
                    break;
                case 5:
                    System.out.print("Tên tìm: ");
                    String key = sc.nextLine();
                    pm.search(key);
                    break;
                case 6:
                    pm.sortAsc();
                    System.out.println("Đã sắp xếp tăng dần.");
                    break;
                case 7:
                    pm.sortDesc();
                    System.out.println("Đã sắp xếp giảm dần.");
                    break;
                case 0:
                    return;
            }
        }
    }
}
