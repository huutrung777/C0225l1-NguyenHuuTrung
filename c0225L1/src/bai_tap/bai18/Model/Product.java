package bai_tap.bai18.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String code, String name, double price, String manufacturer, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getManufacturer() { return manufacturer; }
    public String getDescription() { return description; }


    @Override
    public String toString() {
        return String.format("Mã: %s | Tên: %s | Giá: %.2f | Hãng: %s | Mô tả: %s",
                code, name, price, manufacturer, description);
    }
}

