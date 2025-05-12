package bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int size = 5;

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNhập giá trị cần chèn: ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (0-" + (array.length - 1) + "): ");
        int index = scanner.nextInt();


        if (index < 0 || index >= array.length) {
            System.out.println("Vị trí chèn không hợp lệ!");
        } else if (size >= array.length) {
            System.out.println("Mảng đã đầy, không thể chèn thêm!");
        } else {

            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = x;

            if (index <= size) {
                size++;
            }
            
            System.out.print("Mảng sau khi chèn " + x + " vào vị trí " + index + ": ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
