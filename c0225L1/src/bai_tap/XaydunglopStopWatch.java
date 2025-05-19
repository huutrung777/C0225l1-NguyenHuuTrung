package bai_tap;
import java.util.Random;
class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
public class XaydunglopStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }
        StopWatch watch = new StopWatch();
        watch.start();

        selectionSort(arr);
        watch.stop();

        System.out.println("Thời gian sắp xếp là: " + watch.getElapsedTime() + " mili giây.");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}