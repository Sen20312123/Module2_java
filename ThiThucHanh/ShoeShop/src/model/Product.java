package model;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private long id;
    private String name;
    private double price;
    private int quantity;
    private String type;

    public Product() {
    }

    public Product(long id, String name, double price, int quantity, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }
    public static Product parse(String record) {
        String [] fields = record.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        double price = Double.parseDouble(fields[2]);
        int quantity = Integer.parseInt(fields[3]);
        String type = fields[4];
        return new Product(id,name,price,quantity,type);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  id + ","
                + name + ","
                + price + ","
                + quantity + ","
                + type + ",";
    }
    public int compare(Product o1, Product o2) {
        return (int) (o1.getId() - o2.getId());
    }
    }

