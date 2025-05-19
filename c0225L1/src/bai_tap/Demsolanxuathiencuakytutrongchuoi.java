package bai_tap;

import java.util.Scanner;

public class Demsolanxuathiencuakytutrongchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "123456789112345";
        System.out.println("Chuỗi đang dùng là: " + chuoi);

        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);
        int dem = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("Ký tự '" + kyTu + "' xuất hiện " + dem + " lần trong chuỗi.");
    }
}
