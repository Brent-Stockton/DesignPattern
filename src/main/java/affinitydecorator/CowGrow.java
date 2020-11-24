package affinitydecorator;

/**CowGrow class used to grow cow and abilites.*/
public class CowGrow extends AnimalDecorator {

  /**CowGrow contructor used to build CowGrow.  
   * @param newAnimal used for crating new Animal.
   */
  public CowGrow(Animal newAnimal) {
    super(newAnimal);
  }
  
  //**Method gets description of CowGrow*/
  public String getDescription() {     
    return "Your cow has grown bigger. Can now run 2X as much Milk and Dairy";
               
  }
  
  /**Method gets cost of CowGrow.*/
  public double getCost() {
    return tempBasicAnimal.getCost() + 300.00;
  }
  
  /**Method gets updated Balance after CowGrow purchase.*/
  public double getBalance() {
    return tempBasicAnimal.getBalance() - 300.00;
  }

}
