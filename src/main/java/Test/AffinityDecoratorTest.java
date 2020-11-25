package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import affinitydecorator.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AffinityDecoratorTest {

  AnimalDecorator oneAnimal;

  @Before
  public void setUp() throws Exception {
  }


  @Test
  public void basicAnimalGetCost() {
    BasicAnimal basicAnimal = new BasicAnimal();
    Double ans = basicAnimal.getCost();
    assertEquals(Double.valueOf(0.00), ans); 
  }
  
  @Test
  public void basicAnimalGetDescription() {
    BasicAnimal basicAnimal = new BasicAnimal();
    String ans = basicAnimal.getDescription();
    assertEquals(" ", ans); 
  }
  
  @Test
  public void basicFarmerGetCost() {
    BasicFarmer basicFarmer = new BasicFarmer();
    Double ans = basicFarmer.getCost();
    assertEquals(Double.valueOf(0.00), ans); 
  }
  
  @Test
  public void basicFarmerGetDescription() {
    BasicFarmer basicFarmer = new BasicFarmer();
    String ans = basicFarmer.getDescription(0);
    assertEquals(" " + 0, ans); 
  }
  


}
