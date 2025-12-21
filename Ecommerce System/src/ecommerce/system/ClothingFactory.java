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
import ecommerce.system.Clothing;


public class ClothingFactory implements ProductFactory{
    private String size;
    private String material;
    
    public ClothingFactory(String size, String material) {
        this.size = size;
        this.material = material;
    }
    
    @Override
    public Product createProduct(String name, double price, int stock) {
        return new Clothing(size, material, name, price, "Clothing", stock);
    }
    
}
