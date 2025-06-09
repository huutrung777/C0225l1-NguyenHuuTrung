package bai_tap.bai12.DaoNguoc;

import java.util.Stack;

public class DaoNguocChuoiSuDungStack {
    public static void main(String[] args) {
        String chuoi = "Hello Người đẹp";
        System.out.println("Chuỗi ban đầu: " + chuoi);

        String[] tu = chuoi.trim().split("\\s+");
        Stack<String> wStack = new Stack<>();

        for (String word : tu) {
            wStack.push(word);
        }
        StringBuilder outp = new StringBuilder();
        while (!wStack.isEmpty()) {
            outp.append(wStack.pop());
            if (!wStack.isEmpty()) {
                outp.append(" ");
            }
        }

        System.out.println("Chuỗi sau khi đảo ngược từ: " + outp.toString());
    }
}
