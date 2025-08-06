package thuc_hanh;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Hello C02");
        int i=10;
        float f=20.0f;
        double d=30.0;
        boolean b=true;
        char c='c';
        Float f2=20.0f;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên");
        String name=scanner.nextLine();
        System.out.println("nhập tuổi");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address=scanner.nextLine();
        System.out.println("nhập tên"+name);
        System.out.println("nhập tuổi của bạn là:" +age);
        System.out.println("nhập địa chỉ"+address);
    }
}
