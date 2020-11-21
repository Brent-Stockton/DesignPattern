package affinitydecorator;

public class FarmerEnhanceLevel1 extends FarmerDecorator {

    public FarmerEnhanceLevel1(Farmer newFarmer) {
        super(newFarmer);
        // TODO Auto-generated constructor stub
        System.out.print("Adding abilty to plant 10 crops a day");
        System.out.print("Adding ability to rear 10 animals a day");
        System.out.println("Adding ability to make Farm 200$ day");
    }
    
    public String getDescription() {
        return tempBasicFarmer.getDescription() + " 10 crops, 10 animals, $200";
    }
    
    public double getCost() {
        return tempBasicFarmer.getCost() + 300.00;
    }

}
