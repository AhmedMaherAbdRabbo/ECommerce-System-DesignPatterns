
package ecommerce.system;

import java.util.List;


public class EcommerceSystem {

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
         
         
         Customer customer = new Customer("Ali", "ali@gmail.com", "Cairo");
         
         // 
        Order order = new OrderBuilder()
            .setCustomer(customer)
            .setDeliveryType("Express")
            .setPaymentMethod("Credit Card")
            .setShippingAddress("123 Main St, Cairo")
            .build(); 
        
        
    }
}

        
   
    

