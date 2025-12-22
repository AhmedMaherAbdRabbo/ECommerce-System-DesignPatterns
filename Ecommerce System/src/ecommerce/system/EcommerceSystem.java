/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class EcommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test prototype 
        Product laptop = new Electronics(
            "2 years", "Dell", "Laptop", 25000, "Electronics", 5
        );
        Product laptopCopy = laptop.clone();

        System.out.println(laptop.hashCode());        
        System.out.println(laptopCopy.hashCode());
        
        
        // Test Decorator
        laptop = new GiftWrapDecorator(laptop, "birthday") ;
        laptop = new PremiumPackageDecorator(laptop) ;

         System.out.println(laptop.getPrice());
         System.out.println(laptop.getDetails());
        
    }
    
}
