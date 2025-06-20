    package bai_tap.bai16;

    import java.util.Scanner;

    class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Nhập vào độ dài 3 cạnh của tam giác:");
                System.out.print("Cạnh a: ");
                double a = scanner.nextDouble();
                System.out.print("Cạnh b: ");
                double b = scanner.nextDouble();
                System.out.print("Cạnh c: ");
                double c = scanner.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new IllegalTriangleException("Độ dài các cạnh phải là số dương.");
                }

                if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new IllegalTriangleException("Tổng độ dài của 2 cạnh phải lớn hơn cạnh còn lại.");
                }
                System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
            } catch (IllegalTriangleException e) {
                System.out.println("Lỗi: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi: Nhập vào không hợp lệ.");
            } finally {
                scanner.close();
            }
        }
    }
