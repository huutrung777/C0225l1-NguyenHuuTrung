package bai_tap.bai18.Repository;

import bai_tap.bai18.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final String FILE_NAME = "sanpham.csv";

    public List<Product> readAll() {
        List<Product> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            String line;
            list = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // File có thể chưa tồn tại nên không cần in lỗi
        }
        return list;
    }

    public void saveAll(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

