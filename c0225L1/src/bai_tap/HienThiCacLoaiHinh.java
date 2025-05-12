package bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Tam giác vuông (góc vuông dưới-trái)");
            System.out.println("3. Tam giác vuông (góc vuông trên-trái)");
            System.out.println("4. Tam giác cân");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    int dai = sc.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    int rong = sc.nextInt();
                    for (int i = 0; i < dai; i++) {
                        for (int j = 0; j < rong; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Nhập chiều cao: ");
                    int cao1 = sc.nextInt();
                    for (int i = 1; i <= cao1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Nhập chiều cao: ");
                    int cao2 = sc.nextInt();
                    for (int i = cao2; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.print("Nhập chiều cao: ");
                    int h = sc.nextInt();
                    for (int i = 1; i <= h; i++) {

                        for (int j = 1; j <= h - i; j++) {
                            System.out.print("  ");
                        }

                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn sai, vui lòng thử lại.");
            }

            System.out.println();
        } while (luaChon != 0);
    }
}

