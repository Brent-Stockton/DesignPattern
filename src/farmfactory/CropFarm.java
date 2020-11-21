package farmfactory;

public class CropFarm extends Farm {
    
    public CropFarm() {
        setFarmType("Crop Farm");
        setNumFarmers(6);
        setPassiveCurrency(1000.00);
        displayFarm();
        displayPassiveCurrency();              
    }
}
