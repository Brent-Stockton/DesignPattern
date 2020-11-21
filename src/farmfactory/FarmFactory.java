package farmfactory;

public class FarmFactory {
    
    public Farm createFarm(String newFarmType) {   
        
        Farm newFarm = null;
        
        if((newFarmType.equals("A")) || newFarmType.equals("a")) {
            
            return new AnimalFarm();
        }else if((newFarmType.equals("C")) || newFarmType.equals("c")){               
                return new CropFarm();
            }
        else if((newFarmType.equals("H")) || newFarmType.equals("h")){               
            return new HybridFarm();
        }
        else {
            return null;
        }
    }
}

