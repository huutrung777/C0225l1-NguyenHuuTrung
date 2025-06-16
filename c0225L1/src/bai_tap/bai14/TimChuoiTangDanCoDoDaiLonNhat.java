package bai_tap.bai14;

import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String longest = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (current.isEmpty() || ch > current.charAt(current.length() - 1)) {
                current += ch;
            } else {

                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + ch;
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }

        System.out.println("Chuỗi tăng dần có độ dài lớn nhất: " + longest);
    }
}