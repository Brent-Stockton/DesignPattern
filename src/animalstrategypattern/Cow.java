package animalstrategypattern;

import java.util.Random;

public class Cow extends FarmAnimal{
    
    static final double COW_HEIGHT = 5.0;
    
    /** Cow Construcotr*/
    public Cow() {
        animalType = new isFarmAnimal();       
    }
    
    /** Class gets name of cow*/
    public String getName(){       
        String name = "Dairy Cow\n";      
        return name;       
    }
    
    /** Class gets hight of cow*/
    public double getHight(double COW_HEIGHT){              
        return COW_HEIGHT;      
    }
    
    /** Class gets description of cow*/
    public String getDescription(){       
        String getDesciption = "Description: Dairy Cow can live for 14 days and produce dairy products./n";       
        return getDesciption;       
    }
    
    /** Class gets ability of cow*/
    public String getAbility(){        
        String getDesciption = "Ability: Can produce 5 gallons of milk a day.\n";       
        return getDesciption;        
    }
    
    public void buildBasicCow() {     
        FarmAnimal cow = new Cow();       
        System.out.println("Animal Name: " + cow.getName());
        cow.setHeight(5.0);
        System.out.println("Height: " + cow.getHeight() + "ft.");
        System.out.println("Your cow " + cow.findType());      
        cow.setAgeInDays(returnRandom());
        System.out.println("Age in days: " + cow.getAgeInDays());
        System.out.println(cow.getAbility());
    }
    
    public static int returnRandom() {
        Random rand = new Random();
        int upperBound = 15;
        int random = rand.nextInt(upperBound);
        return random;
        }
}
