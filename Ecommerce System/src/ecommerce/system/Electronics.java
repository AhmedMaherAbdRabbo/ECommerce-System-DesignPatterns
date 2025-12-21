
package ecommerce.system;

public class Electronics extends Product{
    
    private String warranty; // الضمان
    private String brand;

    public Electronics(String warranty, String brand, String name, double price, String category, int stock) {
        super(name, price, category, stock);
        this.warranty = warranty;
        this.brand = brand;
    }
    
    @Override
    public String getDetails() {
    return "Brand: " + brand + ", Warranty: " + warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    

}
