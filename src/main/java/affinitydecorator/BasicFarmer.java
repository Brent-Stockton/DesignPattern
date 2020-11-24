package affinitydecorator;

/**Basic Farmer Class that implements Farmer interface.*/
public class BasicFarmer implements Farmer {

  /**
  * Method gets description of basic farmer.
  * @param numCrops represents number of crops
  */
  @Override
  public String getDescription(int numCrops) {     
    return " " + numCrops;
  }
  
  /** Method gets cost for basic farmer.*/
  @Override
  public double getCost() {        
    return 0.00;
  }

  /** Method gets balance for basic farmer.*/
  @Override
  public double getBalance() {
    return 1000.000;
  }
}
