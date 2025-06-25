package bai_tap.bai18.View;
import bai_tap.bai18.Model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Tìm sản phẩm theo mã");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Product inputProduct() {
        System.out.print("Mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Mô tả: ");
        String description = scanner.nextLine();
        return new Product(code, name, price, manufacturer, description);
    }

    public String inputCodeToSearch() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        return scanner.nextLine();
    }

    public void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            System.out.println("\n--- Danh sách sản phẩm ---");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    public void displayProduct(Product p) {
        if (p != null) {
            System.out.println("Tìm thấy: " + p);
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

