package animalstrategypattern;

import java.util.Random;

public class Wolf extends FarmAnimal {
    
    /**Wolf constructor*/
    public Wolf() {
        animalType = new isPreditor();       
    }
    
    /** Class gets name of Wolf*/
    public String getName(){       
        String name = "Wolf\n";      
        return name;       
    }
    
    /** Class gets hight of Wolf*/
    public double getHight(double height){              
        return height;      
    }
    
    /** Class gets description of Wolf*/
    public String getDescription(){       
        String getDesciption = "Description: Wolf can kill other animal and is a fierce predator./n";       
        return getDesciption;       
    }
    
    /** Class gets ability of Wolf*/
    public String getAbility(){        
        String getDesciption = "Ability: When called you lose 1 farm animal.\n";       
        return getDesciption;        
    }
    
    public void buildBasicWolf() {     
        FarmAnimal wolf = new Wolf();       
        System.out.println("Animal Name: " + wolf.getName());
        wolf.setHeight(3.0);
        System.out.println("Height: " + wolf.getHeight() + "ft.");
        System.out.println("Your horse " + wolf.findType());      
        wolf.setAgeInDays(returnRandom());
        System.out.println("Age in days: " + wolf.getAgeInDays());
        System.out.println(wolf.getAbility());
    }
    
    public static int returnRandom() {
        Random rand = new Random();
        int upperBound = 15;
        int random = rand.nextInt(upperBound);
        return random;
        }

}
