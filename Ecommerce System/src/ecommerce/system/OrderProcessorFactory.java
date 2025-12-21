/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class OrderProcessorFactory {
    
    public static OrderProcessor getProcessor(String deliveryType) {
                
        if (deliveryType == null) {
            return new StandardOrderProcessor();
        }
        
        switch(deliveryType.toLowerCase()) {
            case "express":
                return new ExpressOrderProcessor();
            
            case "standard":
                return new StandardOrderProcessor();
            
            default:
                return new StandardOrderProcessor();
        }
    }
    
}
