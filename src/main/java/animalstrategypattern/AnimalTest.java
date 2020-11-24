package animalstrategypattern;

import java.util.Scanner;

//Main class to test strategy pattern for Animals
public class AnimalTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        System.out.println("Let's randomly populate your Animal farm to begin your farming journey!");
        System.out.println("Remember, animals live for 14 days Maximum.");
        System.out.println();
        
        int maxAnimal = 3;
        //randomly populates farm with farm animals
        for (int i = 0; i < maxAnimal; i++){
            int min = 0;
            int max = 3;
            //Generate random double value from 50 to 100 
            
            int random_int = (int)(Math.random() * (max - min + 1) + min); 
        
        switch(random_int) {
        case 0:
            FarmAnimal cow = new Cow();       
            ((Cow) cow).buildBasicCow();           
        case 1:
            FarmAnimal horse = new Horse();
            ((Horse) horse).buildBasicHorse();           
        case 2:
            FarmAnimal sheep = new Sheep();
            ((Sheep) sheep).buildBasicSheep();            
    }
        }
        
        System.out.println("Something may be lurking near the farm. Let's roll the dice and find out if a preditor took an animal");
        System.out.println("Press C to continue...");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        
        if(userInput.contentEquals("C")) {
        
        int minPred = 0;
        int maxPred = 3;
        
            int randomPred = (int)(Math.random() * (maxPred - minPred + 1) + minPred); 
            if (randomPred == 3) {
            System.out.println("Oh no! It looks like one of your farm animals was eaten by a Wolf.");
            }
            else {
            System.out.println("Few looks like there is no preditors nearby...");
            }
        }
        
        else {
            System.out.println("Sorry, Please enter C to continue...");           
        }
   

        }
    }

