package bai_tap.bai12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoiGoc = nhap.nextLine();
        String chuoi = chuoiGoc.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> nganXep = new Stack<>();
        Queue<Character> hangDoi = new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            nganXep.push(kyTu);
            hangDoi.add(kyTu);
        }

        boolean laPalindrome = true;
        while (!nganXep.isEmpty()) {
            char kyTuStack = nganXep.pop();
            char kyTuQueue = hangDoi.remove();
            if (kyTuStack != kyTuQueue) {
                laPalindrome = false;
                break;
            }
        }

        if (laPalindrome) {
            System.out.println("=> Chuỗi \"" + chuoiGoc + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("=> Chuỗi \"" + chuoiGoc + "\" không phải là chuỗi Palindrome.");
        }
    }
}
