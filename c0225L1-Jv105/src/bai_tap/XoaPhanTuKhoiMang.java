package bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int size = 5;
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNhập phần tử cần xóa: ");
        int x = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }


        if (index_del != -1) {
            for (int i = index_del; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0;
            size--;


            System.out.print("Mảng sau khi xóa " + x + ": ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng.");
        }
    }
}