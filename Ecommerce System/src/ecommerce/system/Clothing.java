
package ecommerce.system;

public class Clothing extends Product{
    
    private String size;
    private String material;

    public Clothing(String name, double price, String category, int stock , String size, String material) {
        super(name, price, category, stock);
        this.size = size;
        this.material = material;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public String getDetails() {
    return "Size: " + size + ", Material: " + material;
    }

    public Product clone(){
        
        return new Clothing( this.name, this.price, this.category, this.stock, this.size, this.material) ;
    
    }
}
