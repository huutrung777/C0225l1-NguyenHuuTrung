package bai_tap.bai15;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử");
        for (int i = 0; i < n; i++) {
            System.out.println("pt[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nCác bước sắp xếp:");
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            System.out.print("Bước " + i + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
