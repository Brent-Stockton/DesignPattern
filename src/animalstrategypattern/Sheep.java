package animalstrategypattern;

import java.util.Random;

public class Sheep extends FarmAnimal {
    
    /**Sheep Constructor*/
    public Sheep() {
        animalType = new isFarmAnimal();       
    }
    
    /** Class gets name of sheep*/
    public String getName(){       
        String name = "Sheep\n";      
        return name;       
    }
    
    /** Class gets hight of sheep*/
    public double getHight(double height){              
        return height;      
    }
    
    /** Class gets description of sheep*/
    public String getDescription(){       
        String getDesciption = "Description: Sheep produces fleece and live for 14 days max./n";       
        return getDesciption;       
    }
    
    /** Class gets ability of sheep*/
    public String getAbility(){        
        String getDesciption = "Ability: Can produce 2 barrels of fleece a day.\n";       
        return getDesciption;        
    }
    
    public void buildBasicSheep() {     
        FarmAnimal sheep = new Sheep();       
        System.out.println("Animal Name: " + sheep.getName());
        sheep.setHeight(3.0);
        System.out.println("Height: " + sheep.getHeight() + "ft.");
        System.out.println("Your horse " + sheep.findType());      
        sheep.setAgeInDays(returnRandom());
        System.out.println("Age in days: " + sheep.getAgeInDays());
        System.out.println(sheep.getAbility());
    }
    
    public static int returnRandom() {
        Random rand = new Random();
        int upperBound = 15;
        int random = rand.nextInt(upperBound);
        return random;
        }

}
