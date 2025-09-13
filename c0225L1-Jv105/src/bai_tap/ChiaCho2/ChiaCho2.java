package bai_tap.ChiaCho2;

public class ChiaCho2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Các số nguyên tố trong mảng là: ");
        for (int n : number) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết thì không phải nguyên tố
            }
        }
        return true;
    }
}
