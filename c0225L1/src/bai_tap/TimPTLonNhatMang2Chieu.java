package bai_tap;

import java.util.Scanner;

public class TimPTLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int soDong = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int soCot = scanner.nextInt();
        double[][] maTran = new double[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử ở dòng " + i + ", cột " + j + ": ");
                maTran[i][j] = scanner.nextDouble();
            }
        }
        double max = maTran[0][0];
        int dongMax = 0;
        int cotMax = 0;

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                    dongMax = i;
                    cotMax = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Vị trí: dòng " + dongMax + ", cột " + cotMax);
    }
}
