/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */


import ecommerce.system.Product;
import ecommerce.system.Electronics;


public class ElectronicsFactory implements ProductFactory {
    private String warranty;
    private String brand;
    
    public ElectronicsFactory(String warranty, String brand) {
        this.warranty = warranty;
        this.brand = brand;
    }
    
    @Override
    public Product createProduct(String name, double price, int stock) {
        return new Electronics(warranty, brand, name, price, "Electronics", stock);
    }
}
