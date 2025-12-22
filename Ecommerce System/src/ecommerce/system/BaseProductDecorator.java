
package ecommerce.system;

public abstract class BaseProductDecorator extends Product {
    
    protected Product product_decrator ; 

    public BaseProductDecorator(Product product) {
        super(product.getName(), product.getPrice(), product.getCategory(), product.getStock());
        this.product_decrator = product;
    }

    @Override
    public double getPrice() {
        return product_decrator.getPrice(); 
    }

    @Override
    public String getDetails(){
        return product_decrator.getDetails();
    }


    @Override
    public void setStock(int stock) {
        product_decrator.setStock(stock); 
    }

    @Override
    public int getStock() {
        return product_decrator.getStock(); 
    }

    @Override
    public String getCategory() {
        return product_decrator.getCategory(); 
    }

    @Override
    public String getName() {
        return product_decrator.getName(); 
    }
    
    
}
