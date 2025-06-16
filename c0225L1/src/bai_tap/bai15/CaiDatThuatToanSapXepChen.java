package bai_tap.bai15;

public class CaiDatThuatToanSapXepChen {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};

        System.out.println("Mảng ban đầu:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
}
}
