package affinitydecorator;

/**Sheepwool class increase wool production.*/
public class SheepWool extends AnimalDecorator {
    
  /**Sheep wool contructor used to build wool ability.
   * @param newAnimal used to pass animal object
   */
  public SheepWool(Animal newAnimal) {
    super(newAnimal);
    // TODO Auto-generated constructor stub
  }
  
  /**Method gets description of enhancement.*/
  public String getDescription() {
    return "Your sheep can now produce wool 2X faster.";            
  }
  
  /**Method gets cost of enhancement.*/
  public double getCost() {
    return tempBasicAnimal.getCost() + 200.00;
  }
  
  /**Method gets balance after enhancement.*/
  public double getBalance() {
    return tempBasicAnimal.getBalance() - 200.00;
  }

}
