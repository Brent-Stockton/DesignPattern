package affinitydecorator;

public class SheepWool extends AnimalDecorator{

    public SheepWool(Animal newAnimal) {
        super(newAnimal);
        // TODO Auto-generated constructor stub
    }
   
    public String getDescription() {
        return "Your sheep can now produce wool 2X faster.";
               
    }
    
    public double getCost() {
        return tempBasicAnimal.getCost() + 200.00;
    }
    
    public double getBalance() {
        return tempBasicAnimal.getBalance() - 200.00;
    }

}
