package bai_tap.bai13;

import java.util.*;

public class ProductManager{
    ArrayList<Product> list = new ArrayList<>();
    public void add(Product p) {
        list.add(p);
    }
    public void edit(int id, String newName, double newPrice) {
        for (Product p : list) {
            if (p.id == id) {
                p.name = newName;
                p.price = newPrice;
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm.");
    }
    public void delete(int id) {
        list.removeIf(p -> p.id == id);
    }
    public void show() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng.");
        }
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public void search(String name) {
        for (Product p : list) {
            if (p.name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
            }
        }
    }


    public void sortAsc() {
        list.sort(Comparator.comparingDouble(p -> p.price));
    }
    public void sortDesc() {
        list.sort((a, b) -> Double.compare(b.price, a.price));
    }
}

