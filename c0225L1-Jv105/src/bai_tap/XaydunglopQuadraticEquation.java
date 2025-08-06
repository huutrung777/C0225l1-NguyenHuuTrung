package bai_tap;

import java.util.Scanner;

public class XaydunglopQuadraticEquation {
    public static class PhuongTrinhBacHai {
        private double a;
        private double b;
        private double c;

        public PhuongTrinhBacHai(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double layA() {
            return a;
        }

        public double layB() {
            return b;
        }

        public double layC() {
            return c;
        }

        public double tinhDelta() {
            return b * b - 4 * a * c;
        }

        public double nghiem1() {
            double delta = tinhDelta();
            if (delta >= 0) {
                return (-b + Math.sqrt(delta)) / (2 * a);
            } else {
                return 0;
            }
        }

        public double nghiem2() {
            double delta = tinhDelta();
            if (delta >= 0) {
                return (-b - Math.sqrt(delta)) / (2 * a);
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            PhuongTrinhBacHai pt = new PhuongTrinhBacHai(a, b, c);

            double delta = pt.tinhDelta();

            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Nghiệm 1: " + pt.nghiem1());
                System.out.println("Nghiệm 2: " + pt.nghiem2());
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + pt.nghiem1());
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }

            scanner.close();
        }
    }
}
