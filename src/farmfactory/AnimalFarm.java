package farmfactory;

public class AnimalFarm extends Farm {
    
    public AnimalFarm() {
        
        setFarmType("Animal Farm");
        setNumFarmers(6);
        setPassiveCurrency(1000.00);
        displayFarm();
        displayPassiveCurrency();     
        
    }    
}
