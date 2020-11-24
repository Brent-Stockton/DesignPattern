package animalstrategypattern;

import java.util.Random;

/**Wolf class used to build wolf objects.*/
public class Wolf extends FarmAnimal {
    
  /**Wolf constructor.*/
  public Wolf() {
    animalType = new isPreditor();       
  }
    
  /** Method gets name of Wolf.*/
  public String getName() {       
    String name = "Wolf\n";      
    return name;       
  }
    
  /** Method gets hight of Wolf.*/
  public double getHight(double height) {              
    return height;      
  }
    
  /** Method gets description of Wolf.*/
  public String getDescription() {       
    String getDesciption = "Description: Wolf can "
            + "kill other animal and is a fierce predator./n";       
    return getDesciption;       
  }
    
  /**Method gets ability of Wolf.*/
  public String getAbility() {        
    String getDesciption = "Ability: When called you lose 1 farm animal.\n";       
    return getDesciption;        
  }
  
  /**Method builds a basic wolf.*/
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
  
  /**Method returns a random number.*/
  public static int returnRandom() {
    Random rand = new Random();
    int upperBound = 15;
    int random = rand.nextInt(upperBound);
    return random;
  }

}
