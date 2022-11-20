package service;

import model.Product;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    private static final String PATH = "E:\\Module2\\ThiThucHanh\\ShoeShop\\data\\product.csv";
    private static ProductService instance;

    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        List<String> records = CSVUtils.readFile(PATH);
        for (String record: records) {
            products.add(Product.parse(record));
        }
        return products;
    }



    public void add(Product newProduct) {
        List<Product> products = findAll();
        products.add(newProduct);
        CSVUtils.writeFile(PATH, products);
    }

    public void update(Product newProduct) {
        List<Product> products = findAll();
        for (Product product: products) {
            if (product.getId() == newProduct.getId()) {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
                product.setQuantity(newProduct.getQuantity());
                product.setType(newProduct.getType());
            }
        }
        CSVUtils.writeFile(PATH, products);
    }

    public void remove(long id) {
        List<Product> products = findAll();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
        CSVUtils.writeFile(PATH, products);
    }

    public Product getProductByID(int id) {
        List<Product> products = findAll();
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public Product getProductByName(String name){
        List<Product> products = findAll();
        for (Product product : products){
            if (product.getName()!= null){
                return product;
            }
        }return null;
    }
    public Product getProductByType(String type){
        List<Product> products = findAll();
        for (Product product : products){
            if (product.getType()!= null){
                return product;
            }
        }return null;
    }
    public boolean exitsts(long id) {
        return getProductByID((int) id) != null;
    }


    public Product findById(long id) {
        List<Product> products = findAll();
        for (Product product:products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }


    public void updateQuantity(long id, int quantity) {
        List<Product> products = findAll();
        for (Product product: products) {
            if (product.getId() == id) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    CSVUtils.writeFile(PATH, products);
                    break;
                }
            }
        }
    }
}
