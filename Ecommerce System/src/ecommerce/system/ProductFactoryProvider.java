/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class ProductFactoryProvider {
    public static ProductFactory getFactory(String category, String spec1, String spec2) {
        switch(category.toLowerCase()) {
            case "electronics":
                return new ElectronicsFactory(spec1, spec2);
            
            case "clothing":
                return new ClothingFactory(spec1, spec2);
            
            case "home appliance":
                int power = Integer.parseInt(spec1);
                return new HomeApplianceFactory(power, spec2);
            
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
}
