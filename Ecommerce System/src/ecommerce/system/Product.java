
package ecommerce.system;

import java.util.ArrayList;

public abstract class Product {
    protected String name;
    protected double price;
    protected String category;
    protected int stock;
    
    private static ArrayList<Product> productList = new ArrayList<>();


    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public static void addProduct(Product product) {
        productList.add(product);
    }
    
    public static ArrayList<Product> getAllProducts() {
        return productList;
    }
    
    public static void removeProduct(Product product) {
        productList.remove(product);
    }
    
    public abstract String getDetails(); 
    
    public abstract Product clone();
    
}
