package animalstrategypattern;

public class FarmAnimal {

    private String name; //Animal Name
    private String description; //Animal Description
    private double height; //Animal Height
    private int ageInDays; //Animal age in Days
    private String ability; //Animal Abilty
    
    public AnimalType animalType;
    
    /**Gets animal name*/
    public String getName() {
        return name;
    }
    
    /**Sets animal name*/
    public void setName(String name) {
        this.name = name;
    }
    
    /**Gets animal description */
    public String getDescription() {
        return description;
    }
    
    /**Sets animal description */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**Gets animal Height */
    public double getHeight() {
        return height;
    }
    
    /**Sets animal Height */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**Gets animal age in days*/
    public int getAgeInDays() {
        return ageInDays;
    }
    
    /**Sets animal age in days*/
    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }
    
    /**Gets animal ability*/
    public String getAbility() {
        return ability;
    }
    
    /**Sets animal ability*/
    public void setAbility(String ability) {
        this.ability = ability;
    }
    
    /**Strategy Pattern to determine animal type*/
    public String findType() {
        return animalType.AType();
    }
    
    /**Strategy Pattern to determine animal type*/
    public void setAnimalType(AnimalType newAnimalType) {
        animalType = newAnimalType;       
    }
    
    
    
    
}
