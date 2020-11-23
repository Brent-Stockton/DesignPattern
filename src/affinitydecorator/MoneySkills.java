package affinitydecorator;

public class MoneySkills extends FarmerDecorator {

    public MoneySkills(Farmer newFarmer) {
        super(newFarmer);
        // TODO Auto-generated constructor stub
        System.out.println("Adding abilty to net an extra $100 a day for farm...");
    }
    
    public String getDescription(int numCrops) {
        return "Each Farmer now has the ablity to net an extra" +  tempBasicFarmer.getDescription(100) + "a day.";
    }
    
    public double getCost() {
        return tempBasicFarmer.getCost() + 400.00;
    }
    
    public double getBalance() {
        double updateBalance = tempBasicFarmer.getBalance() - 400.00;
        return updateBalance;
    }

}