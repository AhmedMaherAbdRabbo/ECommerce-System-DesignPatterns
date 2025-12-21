
package ecommerce.system;

public class Clothing extends Product{
    
    private String size;
    private String material;

    public Clothing(String size, String material, String name, double price, String category, int stock) {
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

    
}
