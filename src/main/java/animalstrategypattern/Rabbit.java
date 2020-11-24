package animalstrategypattern;

/**Rabbit class extending FarmAnimal.*/
public class Rabbit extends FarmAnimal {
   
  /**Rabbit constructor.*/ 
  public Rabbit() {
    animalType = new isPreditor();       
  }
    
  /** Class gets name of Rabbit.*/
  public String getName() {       
    String name = "Rabbit\n";      
    return name;       
  }
    
  /** Class gets hight of Rabbit.
   * @param height double value of height
   */
  public double getHight(double height) {              
    return height;      
  }
    
  /** Class gets description of Rabbit.*/
  public String getDescription() {       
    String getDesciption = "Description: Rabbit can eat crops and is are a nasty pest./n";       
    return getDesciption;       
  }
    
  /** Class gets ability of Rabbit.*/
  public String getAbility() {        
    String getDesciption = "Ability: When called you lose 2 farm crops.\n";       
    return getDesciption;        
  }

}
