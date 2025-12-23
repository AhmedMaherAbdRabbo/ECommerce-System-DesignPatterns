
package ecommerce.system;

public class HomeAppliance extends Product {
    
    private String powerConsumption; // 
    private String energyRating;

    public HomeAppliance(String name, double price, String category, int stock , String powerConsumption, String energyRating) {
        super(name, price, category, stock);
        this.powerConsumption = powerConsumption;
        this.energyRating = energyRating;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getEnergyRating() {
        return energyRating;
    }

    public void setEnergyRating(String energyRating) {
        this.energyRating = energyRating;
    }
    
    @Override
    public String getDetails() {
    return "Power: " + powerConsumption + "W, Rating: " + energyRating;
    }

    
    public Product clone(){
    
        return new HomeAppliance( this.name, this.price, this.category, this.stock , this.powerConsumption, this.energyRating);
    }
    
}
