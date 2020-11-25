package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import farmfactory.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class FarmFactoryTest {

  @Before
  public void setUp() throws Exception {
  }


  @Test
  public void displayAnimalFarmTest() {
    AnimalFarm i = new AnimalFarm();
    String ans = i.displayFarm();
    assertEquals("Your farm is " + i.getFarmType() + ".", ans);
  }
  
  @Test
  public void displayFarmersTest() {
    AnimalFarm i = new AnimalFarm();
    String ans = i.displayFarmers();
    assertEquals("Your number of farmers is " + i.getNumFarmers() + ".", ans);
  }
  
  @Test
  public void displayAcresTest() {
    AnimalFarm i = new AnimalFarm();
    String ans = i.dislayAcres();
    assertEquals("You have " + i.getNumAcres() + " Acres.", ans);
  }
  

  
}