package bai_tap;

public class HienThisntnhohon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
