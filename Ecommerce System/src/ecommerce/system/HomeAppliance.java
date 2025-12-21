
package ecommerce.system;

public class HomeAppliance extends Product {
    
    private int powerConsumption; // 
    private String energyRating;

    public HomeAppliance(int powerConsumption, String energyRating, String name, double price, String category, int stock) {
        super(name, price, category, stock);
        this.powerConsumption = powerConsumption;
        this.energyRating = energyRating;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
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
    
        return new HomeAppliance(this.powerConsumption, this.energyRating, this.name, this.price, this.category, this.stock);
    }
    
}
