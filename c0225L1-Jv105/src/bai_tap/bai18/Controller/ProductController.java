package bai_tap.bai18.Controller;
import bai_tap.bai18.Model.Product;
import bai_tap.bai18.Repository.ProductRepository;
import bai_tap.bai18.View.ProductView;

import java.util.List;

public class ProductController {
    private final ProductRepository repository;
    private final ProductView view;
    private List<Product> products;

    public ProductController(ProductRepository repository, ProductView view) {
        this.repository = repository;
        this.view = view;
        this.products = repository.readAll();
    }

    public void run() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1 -> {
                    Product p = view.inputProduct();
                    products.add(p);
                    repository.saveAll(products);
                    view.showMessage("Thêm thành công!");
                }
                case 2 -> view.displayProducts(products);
                case 3 -> {
                    String code = view.inputCodeToSearch();
                    Product found = findByCode(code);
                    view.displayProduct(found);
                }
                case 0 -> {
                    view.showMessage("Tạm biệt!");
                    return;
                }
                default -> view.showMessage("Lựa chọn không hợp lệ!");
            }
        }
    }

    private Product findByCode(String code) {
        for (Product p : products) {
            if (p.getCode().equalsIgnoreCase(code)) {
                return p;
            }
        }
        return null;
    }
}

