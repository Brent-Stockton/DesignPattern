package affinitydecorator;

/**Class used to increase Horse Speed using the Animal Decorator.*/
public class HorseSpeed extends AnimalDecorator {

  /**HorseSpeed constructor used for planting ability.
  * @param newAnimal used to pass object from Animal class.
  * */  
  public HorseSpeed(Animal newAnimal) {
    super(newAnimal);
       
  }
  
  /**Method gets description of enhancement.*/
  public String getDescription() {
    return "Your horse can now run 2X faster. Speed is now 25 mph";
               
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
