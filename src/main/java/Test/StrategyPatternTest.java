package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import animalstrategypattern.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

  @Before
  public void setUp() throws Exception {
  }


  @Test
  public void cowGetName() {
    Cow cow = new Cow();
    String ans = cow.getName();
    assertEquals("Dairy Cow\n", ans); 
  }
  
  @Test
  public void cowGetDescription() {
    Cow cow = new Cow();
    String ans = cow.getDescription();
    assertEquals("Description: Dairy "
        + "Cow can live for 14 days and produce dairy products./n", ans); 
  }
  
  @Test
  public void cowGetAbility() {
    Cow cow = new Cow();
    String ans = cow.getAbility();
    assertEquals("Ability: Can produce 5 gallons of milk a day.\n", ans); 
  }
  
  @Test
  public void horseGetName() {
    Horse horse = new Horse();
    String ans = horse.getName();
    assertEquals("Horse\n", ans); 
  }
  
  @Test
  public void foxGetDescription() {
    Horse horse = new Horse();
    String ans = horse.getDescription();
    assertEquals("Description: Horses can race to generate money./n", ans); 
  }
  
  @Test
  public void horseGetAbility() {
    Horse horse = new Horse();
    String ans = horse.getAbility();
    assertEquals("Ability: When called you gain 300 in racing winnings.\n", ans); 
  }
  
}
  

  
