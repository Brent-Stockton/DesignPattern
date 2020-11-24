package affinitydecorator;

/**CropPlant class used for planting ability.*/
public class CropPlant extends FarmerDecorator {
    
  /**CropPlant constructor used for planting ability.
   * @param newFarmer used to pass object from farmer class.
   * */
  public CropPlant(Farmer newFarmer) {
    super(newFarmer);    
    System.out.println("Adding abilty to plant 10 crops a day...");
  }
  
  /** Methods gets description using numCrops.
   * @param numCrops gets number of crops
   */
  public String getDescription(int numCrops) {
    return "Farmers can now plant" + tempBasicFarmer.getDescription(10) + " crops a day";
               
  }
  
  /**Methods gets cost to plant crop.s*/
  public double getCost() {
    return tempBasicFarmer.getCost() + 300.00;
  }
  
  /**Methods gets balance after planting crops.*/
  public double getBalance() {
    return tempBasicFarmer.getBalance() - 300.00;
  }
}
