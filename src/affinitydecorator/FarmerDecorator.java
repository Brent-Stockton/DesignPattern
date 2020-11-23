package affinitydecorator;

public abstract class FarmerDecorator implements Farmer {
    
    protected Farmer tempBasicFarmer;
    
    public FarmerDecorator(Farmer newFarmer) {     
        tempBasicFarmer = newFarmer;       
    }
    
    public String getDescription(int numCrops ) {
        return tempBasicFarmer.getDescription(numCrops);
    }
    
    public double getCost() {
        return tempBasicFarmer.getCost();
    }
    
    public double getBalance() {
        return tempBasicFarmer.getBalance();
    }

}
