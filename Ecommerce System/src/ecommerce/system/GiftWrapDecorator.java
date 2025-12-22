
package ecommerce.system;

public class GiftWrapDecorator extends BaseProductDecorator{
    
    private double wrapCost = 75;
    private String style; 

    public GiftWrapDecorator(Product product , String style) {
        super(product);
        this.style = style;
    }

    @Override
    public String getDetails() {
        return product_decrator.getDetails() + ", Gift Wrap (" + style + ")"; 
    }

    @Override
    public double getPrice() {
        return product_decrator.getPrice() + wrapCost; 
    }

    
    public Product clone(){
       return new GiftWrapDecorator(product_decrator.clone(), this.style);
    }
    
    
}
