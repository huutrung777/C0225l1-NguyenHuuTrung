package bai_tap.bai18.View;

import bai_tap.bai18.Controller.ProductController;
import bai_tap.bai18.Repository.ProductRepository;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(repo, view);
        controller.run();
    }
}
