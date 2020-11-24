package animalstrategypattern;

import java.util.Random;

public class Horse extends FarmAnimal {
    
    public Horse() {
        animalType = new isFarmAnimal();
        
    }
    
    /** Class gets name of Mole*/
    public String getName(){       
        String name = "Horse\n";      
        return name;       
    }
    
    /** Class gets hight of Mole*/
    public double getHight(double height){              
        return height;      
    }
    
    /** Class gets description of Mole*/
    public String getDescription(){       
        String getDesciption = "Description: Horses can race to generate money./n";       
        return getDesciption;       
    }
    
    /** Class gets ability of Mole*/
    public String getAbility(){        
        String getDesciption = "Ability: When called you gain 300 in racing winnings.\n";       
        return getDesciption;        
    }
    
    public void buildBasicHorse() {     
        FarmAnimal horse = new Horse();       
        System.out.println("Animal Name: " + horse.getName());
        horse.setHeight(8.0);
        System.out.println("Height: " + horse.getHeight() + "ft.");
        System.out.println("Your horse " + horse.findType());      
        horse.setAgeInDays(returnRandom());
        System.out.println("Age in days: " + horse.getAgeInDays());
        System.out.println(horse.getAbility());
    }
    
    public static int returnRandom() {
        Random rand = new Random();
        int upperBound = 15;
        int random = rand.nextInt(upperBound);
        return random;
        }

}
