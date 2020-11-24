package farmfactory;

public class HybridFarm extends Farm {
  
  /**HybridFarm constructor.*/
  public HybridFarm() {
    setFarmType("Hybrid Farm");
    setNumFarmers(6);
    setPassiveCurrency(1000.00);
    setNumCrops(10);
    setNumAnimals(3);
    displayFarm();
    displayFarmers();
    dislayAcres();
    displayNumCrops();
    displayNumAnimals();
    displayPassiveCurrency();       
  }
    

}
