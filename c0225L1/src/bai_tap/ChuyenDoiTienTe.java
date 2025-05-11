package bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD");
        usd = scanner.nextDouble();
        double quydoi=usd*vnd;
        System.out.println("giá tiền VND"+quydoi);
    }
}
