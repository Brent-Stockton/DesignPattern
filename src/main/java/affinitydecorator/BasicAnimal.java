package affinitydecorator;

/*Basic Animal Class that implements Animal Interface.*/
public class BasicAnimal implements Animal {

  /**Method that gets description of basic animal.*/  
  @Override
  public String getDescription() {
    return " ";
  }

  /**Method that gets cost of basic animal.*/ 
  @Override
  public double getCost() {     
    return 0.00;
  }

  /**Method that gets balance of basic animal.*/ 
  @Override
  public double getBalance() {
      
    return 1000.00;
  }

    
    

}