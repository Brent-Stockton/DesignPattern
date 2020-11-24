package affinitydecorator;

/**MoneySkills class ass money making ability.*/
public class MoneySkills extends FarmerDecorator {

  /**Money Skills constructor build ability.
   * @param newFarmer used to pass object from farmer class.
   * */  
  public MoneySkills(Farmer newFarmer) {
    super(newFarmer);
    // TODO Auto-generated constructor stub
    System.out.println("Adding abilty to net an extra $100 a day for farm...");
  }
  
  /**Gets description of enhancement.*/
  public String getDescription(int numCrops) {
    return "Each Farmer now has the ablity to net an extra"
      +  tempBasicFarmer.getDescription(100) + "a day.";
  }
  
  /**Gets cost of enhancement.*/
  public double getCost() {
    return tempBasicFarmer.getCost() + 400.00;
  }
  
  /**Gets balance after enhancement.*/
  public double getBalance() {
    double updateBalance = tempBasicFarmer.getBalance() - 400.00;
    return updateBalance;
  }

}