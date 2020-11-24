package affinitydecorator;

/**Abstract Decorator class that implements Farmer Interface.*/
public abstract class FarmerDecorator implements Farmer {
    
  protected Farmer tempBasicFarmer;
  
  /**CropPlant constructor used for planting ability.
   * @param newFarmer used to pass object from farmer class.
   * */
  public FarmerDecorator(Farmer newFarmer) {     
    tempBasicFarmer = newFarmer;       
  }
  
  /** Methods gets description using numCrops.
   * @param numCrops gets number of crops
   */
  public String getDescription(int numCrops) {
    return tempBasicFarmer.getDescription(numCrops);
  }
   
  /**Methods gets cost to decorate.s*/
  public double getCost() {
    return tempBasicFarmer.getCost();
  }
   
  /**Methods gets cost after decorate.s*/
  public double getBalance() {
    return tempBasicFarmer.getBalance();
  }
}
