package affinitydecorator;

import java.util.Scanner;

public class Main {
    
  
    public static void main(String[] args) {
        
        System.out.println("Would you like to upgrade your farmers or animals?");
        System.out.println("Would F for farmers / A for Animals / N for no");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        
        if(userInput.contentEquals("F")) {
        System.out.println("Type C to purchase Crop Growing Ability Enhancement - $300");
        System.out.println("Type A to purchase Animal Rearing Ability Enhancement - $200");
        System.out.println("Type M to purchase Money Skill Ability Enhancement - $400");
        System.out.println("Type N for no");
        Scanner cc = new Scanner(System.in);
        String txt = cc.nextLine();
        
       switch(txt) {   
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
           System.out.println("Balance: Your updated balance is $" + basicAnimalFarmer.getBalance()); 
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
        if(userInput.contentEquals("A")) {
            System.out.println("Type C to purchase Cow Growing Ability Enhancement - $300");
            System.out.println("Type H to purchase Horse Speed Ability Enhancement - $200");
            System.out.println("Type S to purchase Sheep Grow Ability Enhancement - $400");
            System.out.println("Type N for no");
            Scanner cc = new Scanner(System.in);
            String txt = cc.nextLine();
            
           switch(txt) {   
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
        }
        else {
            System.out.println("Hi");
        }
        
    }
}
    


