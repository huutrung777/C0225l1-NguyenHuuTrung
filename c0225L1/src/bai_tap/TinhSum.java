package bai_tap;

import java.util.Scanner;

public class TinhSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int hang = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cot = scanner.nextInt();

        double[][] mang = new double[hang][cot];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                mang[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập số thứ tự cột muốn tính tổng (tính từ 0): ");
        int cotCanTinh = scanner.nextInt();

        double tong = 0;
        for (int i = 0; i < hang; i++) {
            tong += mang[i][cotCanTinh];
        }

        System.out.println("Tổng của cột " + cotCanTinh + " là: " + tong);
    }

}
