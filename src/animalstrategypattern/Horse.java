package animalstrategypattern;

import java.util.Random;

//Class used to build horse objects.*/
public class Horse extends FarmAnimal {
  
  /**Horse Constructor.*/
  public Horse() {
    animalType = new isFarmAnimal();
    
  }
    
  /** Class gets name of Mole.*/
  public String getName() {       
    String name = "Horse\n";      
    return name;       
  }
    
  /** Class gets hight of Mole.
   * @param height passed height double
   */
  public double getHight(double height) {              
    return height;      
  }
    
  /** Class gets description of Mole.*/
  public String getDescription() {       
    String getDesciption = "Description: Horses can race to generate money./n";       
    return getDesciption;       
  }
    
  /** Class gets ability of Mole.*/
  public String getAbility() {        
    String getDesciption = "Ability: When called you gain 300 in racing winnings.\n";       
    return getDesciption;        
  }
  
  /**Methods builds a basic horse.*/
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
  
  /**Methods returns random number between 0-14.*/ 
  public static int returnRandom() {
    Random rand = new Random();
    int upperBound = 15;
    int random = rand.nextInt(upperBound);
    return random;
  }

}
