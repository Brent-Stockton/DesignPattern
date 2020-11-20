package farmfactory;

public class AnimalFarm implements Farm {

    private String Animal;
    private String Farmer;
    private int Acres;
    
    
    public AnimalFarm(String Animal, String Farmer, int Acres) {
        this.Animal = Animal;
        this.Farmer = Farmer;
        this.Acres = Acres;
    }
    
    
}
