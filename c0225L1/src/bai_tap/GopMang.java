package bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n = scanner.nextInt();
        int[] mang1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("mang1[" + i + "] = ");
            mang1[i] = scanner.nextInt();
        }

        System.out.print("Nhập số phần tử của mảng 2: ");
        int m = scanner.nextInt();
        int[] mang2 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("mang2[" + i + "] = ");
            mang2[i] = scanner.nextInt();
        }
        int[] mang3 = new int[n + m];

        for (int i = 0; i < n; i++) {
            mang3[i] = mang1[i];
        }
        for (int i = 0; i < m; i++) {
            mang3[n + i] = mang2[i];
        }
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < mang3.length; i++) {
            System.out.print(mang3[i] + " ");
        }
    }
}
