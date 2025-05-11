package bai_tap;

import java.util.Scanner;

public class DocChuThanhSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số (0 - 999): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 999) {
            System.out.println("out of ability");
            return;
        }

        String[] donVi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tu10_19 = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] chuc = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (n < 10) {
            System.out.println(donVi[n]);
        } else if (n < 20) {
            System.out.println(tu10_19[n - 10]);
        } else if (n < 100) {
            int hangChuc = n / 10;
            int hangDonVi = n % 10;
            if (hangDonVi == 0) {
                System.out.println(chuc[hangChuc]);
            } else {
                System.out.println(chuc[hangChuc] + " " + donVi[hangDonVi]);
            }
        } else { // từ 100 đến 999
            int hangTram = n / 100;
            int phanDu = n % 100;
            String ketQua = donVi[hangTram] + " hundred";

            if (phanDu == 0) {
                System.out.println(ketQua);
            } else {
                // Gọi lại phần đọc số < 100
                if (phanDu < 10) {
                    ketQua += " and " + donVi[phanDu];
                } else if (phanDu < 20) {
                    ketQua += " and " + tu10_19[phanDu - 10];
                } else {
                    int hangChuc = phanDu / 10;
                    int hangDonVi = phanDu % 10;
                    ketQua += " and " + chuc[hangChuc];
                    if (hangDonVi != 0) {
                        ketQua += " " + donVi[hangDonVi];
                    }
                }
                System.out.println(ketQua);

            }
        }
    }
}
