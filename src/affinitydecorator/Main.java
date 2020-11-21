package affinitydecorator;

public class Main {
    
    public static void main(String[] args) {
        
        Farmer basicFarmer = new FarmerEnhanceLevel1(new BasicFarmer());
        
        System.out.println("Farmer: " + basicFarmer.getDescription());
    }

}
