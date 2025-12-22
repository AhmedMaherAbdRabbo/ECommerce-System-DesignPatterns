
package ecommerce.system;


public class PremiumPackageDecorator extends BaseProductDecorator{
    
    protected double premiumPackage = 160 ;

    public PremiumPackageDecorator(Product product) {
        super(product);
    }
 
    
    @Override
    public String getDetails() {
        return product_decrator.getDetails() + ", Premium Package"; 
    }

    @Override
    public double getPrice() {
        return product_decrator.getPrice() + premiumPackage; 
    }

    
    public Product clone(){
       return new PremiumPackageDecorator(product_decrator.clone());
    }    
    
    
}
