package affinitydecorator;

public class BasicFarmer implements Farmer {

    
    @Override
    public String getDescription(int numCrops) {
        // TODO Auto-generated method stub      
        return " " + numCrops;
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 0.00;
    }

    @Override
    public double getBalance() {
        // TODO Auto-generated method stub
        return 1000.000;
    }
    
    

}
