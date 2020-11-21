package farmfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FarmFactory newFarmFactory = new FarmFactory();
        Farm theFarm = null;
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of Farm would you like to choose?");
        System.out.println("Type A for Animal Farm, C for Crop Farm, or H for Hybrid Farm");
        
        if(userInput.hasNextLine()) {
            String typeOfFarm = userInput.nextLine();
            theFarm = newFarmFactory.createFarm(typeOfFarm);           
        }
        if(theFarm != null) {
            makeFarm(theFarm);
        }else {
            System.out.println("Please Type in Valid Farm Character: A / C / H.");
        }

    }
    
    public static void makeFarm(Farm aNewFarm) {
    }

}
