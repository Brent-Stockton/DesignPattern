package affinitydecorator;

public class BasicFarmer implements Farmer {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        String abilities = "Can plant 5 crops a day. Can rear 5 animals a day. Can make Farm 100$ a day";
        return abilities;
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 0.00;
    }
    
    

}
