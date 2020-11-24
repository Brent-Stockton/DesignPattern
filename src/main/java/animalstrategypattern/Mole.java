package animalstrategypattern;

public class Mole extends FarmAnimal {
    
  /** Mole Construcor.*/
  public Mole() {
    animalType = new isPreditor();       
  }   
  
  /** Class gets name of Mole.*/
  public String getName() {       
    String name = "Mole\n";      
    return name;       
  }
    
  /** Class gets hight of Mole.
   * @param height double value of height
   * */
  public double getHight(double height) {              
    return height;      
  }
    
  /** Class gets description of Mole.*/
  public String getDescription() {       
    String getDesciption = "Description: Moles can eat crops and is are a nasty pest./n";       
    return getDesciption;       
  }
    
  /** Class gets ability of Mole.*/
  public String getAbility() {        
    String getDesciption = "Ability: When called you lose 1 farm crops.\n";       
    return getDesciption;        
  }

}
