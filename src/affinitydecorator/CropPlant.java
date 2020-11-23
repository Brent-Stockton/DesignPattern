package affinitydecorator;

public class CropPlant extends FarmerDecorator {

    public CropPlant(Farmer newFarmer) {
        super(newFarmer);
        // TODO Auto-generated constructor stub
        System.out.println("Adding abilty to plant 10 crops a day...");
    }
    
    public String getDescription(int numCrops) {
        return "Farmers can now plant" + tempBasicFarmer.getDescription(10) + " crops a day";
               
    }
    
    public double getCost() {
        return tempBasicFarmer.getCost() + 300.00;
    }
    
    public double getBalance() {
        return tempBasicFarmer.getBalance() - 300.00;
    }

}
