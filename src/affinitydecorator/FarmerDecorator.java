package affinitydecorator;

public abstract class FarmerDecorator implements Farmer {
    
    protected Farmer tempBasicFarmer;
    
    public FarmerDecorator(Farmer newFarmer) {     
        tempBasicFarmer = newFarmer;       
    }
    
    public String getDescription() {
        return tempBasicFarmer.getDescription();
    }
    
    public double getCost() {
        return tempBasicFarmer.getCost();
    }

}
