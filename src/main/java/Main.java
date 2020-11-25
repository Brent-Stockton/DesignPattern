
import affinitydecorator.*;
import animalstrategypattern.*;
import farmfactory.*;
import java.util.Scanner;

/**Main class to run program.*/
public class Main {

  /**Main method to run program.*/
    public static void main(String[] args) {
        
        
    //BUILD FARM - FACTORY PATTERN
        
    FarmFactory newFarmFactory = new FarmFactory();
    Farm theFarm = null;
        
    Scanner userInput = new Scanner(System.in);
    System.out.println("What type of Farm would you like to choose?");
    System.out.println("Type A for Animal Farm, C for Crop Farm, or H for Hybrid Farm");
        
    if (userInput.hasNextLine()) {
      String typeOfFarm = userInput.nextLine();
      theFarm = newFarmFactory.createFarm(typeOfFarm);           
    }
    if (theFarm != null) {
      makeFarm(theFarm);
    } else { 
      System.out.println("Please Type in Valid Farm Character: A / C / H");
    }
        
    System.out.print("Please press C to continue to Animal Startegy Pattern Design");    
        
    //ANIMAL STRATEGY PATTERN
    System.out.println("Let's randomly populate your Animal farm to begin your farming journey!");
    System.out.println("Remember, animals live for 14 days Maximum.");
    System.out.println();
        
    int maxAnimal = 3;
    //randomly populates farm with farm animals
    for (int i = 0; i < maxAnimal; i++){
      int min = 0;
      int max = 3;
                       
      int randomInt = (int) (Math.random() * (max - min + 1) + min); 
        
      switch (randomInt) {
        case 0:
          FarmAnimal cow = new Cow();       
          ((Cow) cow).buildBasicCow();         
          break;
        case 1:
          FarmAnimal horse = new Horse();
          ((Horse) horse).buildBasicHorse();           
          break;
        case 2:
          FarmAnimal sheep = new Sheep();
          ((Sheep) sheep).buildBasicSheep();
          break;
        default:
          break;            
      }
    }
        
    System.out.println("Something may be lurking near the farm. Let's roll "
                + "the dice and find out if a preditor took an animal");
    System.out.println("Press C to continue...");
    Scanner input = new Scanner(System.in);
    String useInput = input.nextLine();
        
    if (useInput.contentEquals("C")) {
        
      int minPred = 0;
      int maxPred = 3;
        
      int randomPred = (int) (Math.random() * (maxPred - minPred + 1) + minPred); 
      if (randomPred == 3) {
        System.out.println("Oh no! It looks like one of your farm "
                + "animals was eaten by a Wolf."); 
      }  else {
        System.out.println("Few looks like there is no preditors nearby...");
      }
    } else {
      System.out.println("Sorry, Please enter C to continue...");           
    }       
    
    //ANIMAL DECORATOR PATTERN
    System.out.println("Would you like to upgrade your farmers or animals?");
    System.out.println("Would F for farmers / A for Animals / N for no");
    Scanner myInput = new Scanner(System.in);
    String theInput = myInput.nextLine();
    
    if (theInput.contentEquals("F")) {
      System.out.println("Type C to purchase Crop Growing Ability Enhancement - $300");
      System.out.println("Type A to purchase Animal Rearing Ability Enhancement - $200");
      System.out.println("Type M to purchase Money Skill Ability Enhancement - $400");
      System.out.println("Type N for no");
      Scanner cc = new Scanner(System.in);
      String txt = cc.nextLine();
    
      switch (txt) {   
        case "C":
          Farmer basicCropFarmer = new CropPlant(new BasicFarmer());
          System.out.println("Farmers: " + basicCropFarmer.getDescription(10));
          System.out.println("Cost: Your enhancment cost $" + basicCropFarmer.getCost()); 
          System.out.println("Balance: Your updated balance is $" + basicCropFarmer.getBalance()); 
          break;
        case "A":
          Farmer basicAnimalFarmer = new AnimalRear(new BasicFarmer());
          System.out.println("Farmers: " + basicAnimalFarmer.getDescription(10));
          System.out.println("Cost: Your enhancment cost $" + basicAnimalFarmer.getCost()); 
          System.out.println("Balance: Your updated "
                  + "balance is $" + basicAnimalFarmer.getBalance()); 
          break;
        case "M":
          Farmer basicMoneyFarmer = new MoneySkills(new BasicFarmer());
          System.out.println("Farmers: " + basicMoneyFarmer.getDescription(100));
          System.out.println("Cost: Your enhancment cost $" + basicMoneyFarmer.getCost()); 
          System.out.println("Balance: Your updated balance is $" + basicMoneyFarmer.getBalance()); 
          break;
        case "N":
      
          System.out.println("Ok lets move on...");
          break;
       
        default:
          System.out.println("Invalid Choice");
          break;
      }
   
    }
    
    if (theInput.contentEquals("A")) {
      System.out.println("Type C to purchase Cow Growing Ability Enhancement - $300");
      System.out.println("Type H to purchase Horse Speed Ability Enhancement - $200");
      System.out.println("Type S to purchase Sheep Grow Ability Enhancement - $400");
      System.out.println("Type N for no");
      Scanner cc = new Scanner(System.in);
      String txt = cc.nextLine();
        
      switch (txt) {   
        case "C":
          Animal basicCow = new CowGrow(new BasicAnimal());
          System.out.println("Animal: " + basicCow.getDescription());
          System.out.println("Cost: Your enhancment cost $" + basicCow.getCost()); 
          System.out.println("Balance: Your updated balance is $" + basicCow.getBalance()); 
          break;
        case "H":
          Animal basicHorse = new HorseSpeed(new BasicAnimal());
          System.out.println("Animal: " + basicHorse.getDescription());
          System.out.println("Cost: Your enhancment cost $" + basicHorse.getCost()); 
          System.out.println("Balance: Your updated balance is $" + basicHorse.getBalance());
          break;
           
        case "S":
          Animal basicSheep = new SheepWool(new BasicAnimal());
          System.out.println("Animal: " + basicSheep.getDescription());
          System.out.println("Cost: Your enhancment cost $" + basicSheep.getCost()); 
          System.out.println("Balance: Your updated balance is $" + basicSheep.getBalance());
          break;
          
        case "N":
          
          System.out.println("Ok lets move on...");
          break;
           
        default:
          System.out.println("Invalid Choice");
          break;
      }        
      
    } else {
      System.out.println("Hi");
    }    
  }
    
  public static void makeFarm(Farm myNewFarm) {
        
  }
   

}
