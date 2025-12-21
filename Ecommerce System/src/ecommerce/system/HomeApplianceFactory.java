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
import ecommerce.system.HomeAppliance;

public class HomeApplianceFactory implements ProductFactory {
    private int powerConsumption;
    private String energyRating;
    
    public HomeApplianceFactory(int powerConsumption, String energyRating) {
        this.powerConsumption = powerConsumption;
        this.energyRating = energyRating;
    }
    
    @Override
    public Product createProduct(String name, double price, int stock) {
        return new HomeAppliance(powerConsumption, energyRating, name, price, "Home Appliance", stock);
    }
    
}
