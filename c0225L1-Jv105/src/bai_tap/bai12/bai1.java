package bai_tap.bai12;

import java.util.Scanner;
import java.util.Stack;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên ở hệ thập phân: ");
        int soThapPhan = sc.nextInt();
        Stack<Integer> nganXep = new Stack<>();
        int so = soThapPhan;
        while (so > 0) {
            int phanDu = so % 2;
            nganXep.push(phanDu);
            so = so / 2;
        }

        System.out.print("Số nhị phân tương ứng là: ");
        while (!nganXep.isEmpty()) {
            System.out.print(nganXep.pop());
        }
        System.out.println();
    }
}
