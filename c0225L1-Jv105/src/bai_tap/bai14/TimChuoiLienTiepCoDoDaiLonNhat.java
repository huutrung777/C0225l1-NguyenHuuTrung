package bai_tap.bai14;

import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String maxSub = "";
        String currentSub = "";

        currentSub += input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) >= input.charAt(i - 1)) {
                currentSub += input.charAt(i);
            } else {
                if (currentSub.length() > maxSub.length()) {
                    maxSub = currentSub;
                }
                currentSub = "" + input.charAt(i);
            }
        }

        if (currentSub.length() > maxSub.length()) {
            maxSub = currentSub;
        }

        System.out.println("Chuỗi con dài nhất tăng dần: " + maxSub);
    }
}
