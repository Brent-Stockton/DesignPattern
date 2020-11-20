package farmfactory;

public class FarmFactory {
    
    public Farm createFarm(String type) {
        
        if(type.equals(Farm.ANIMAL_FARM)) {
            return new AnimalFarm("Pig", "Beginner Farmer", 32);
        }
        
        
        
        
        return null;
        
    }

}
