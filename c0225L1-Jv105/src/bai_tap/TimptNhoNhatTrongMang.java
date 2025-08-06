package bai_tap;

import java.util.Scanner;

public class TimptNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] mang = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int min = mang[0];

        for (int i = 1; i < size; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
