package farmfactory;

public class CropFarm implements Farm {
    
    private String Crop;
    private String Farmer;
    
    public CropFarm(String crop, String Farmer) {
        this.Farmer = Farmer;
        this.Crop = Crop;
    }

}
