package affinitydecorator;

public class AnimalRear extends FarmerDecorator {

  /**AnimalRear Constructor.*/
  public AnimalRear(Farmer newFarmer) {
    super(newFarmer);
    System.out.println("Adding abilty to rear 10 Animals a cycle...");
  }
    
  public String getDescription(int numCrops) {
    return "Farmers can now rear" + tempBasicFarmer.getDescription(10) + " animals a cycle";
               
  }
  
  public double getCost() {
    return tempBasicFarmer.getCost() + 200.00;
  }
    
  public double getBalance() {
    double updateBalance = tempBasicFarmer.getBalance() - 200.00;
    return updateBalance;
  }

}

