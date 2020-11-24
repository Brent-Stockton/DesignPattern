package affinitydecorator;

public abstract class AnimalDecorator implements Animal {
  protected Animal tempBasicAnimal;
    
  /** Contructor for AnimalDecorator.*/
  public AnimalDecorator(Animal newAnimal) {     
    tempBasicAnimal = newAnimal;       
  }
    
  /** getDescription method. */
  public String getDescription() {
    return tempBasicAnimal.getDescription();
  }
    
  public double getCost() {
    return tempBasicAnimal.getCost();
  }
    
  public double getBalance() {
    return tempBasicAnimal.getBalance();
  }

}
