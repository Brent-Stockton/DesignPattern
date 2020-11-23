package affinitydecorator;

public class HorseSpeed extends AnimalDecorator {

    public HorseSpeed(Animal newAnimal) {
        super(newAnimal);
        // TODO Auto-generated constructor stub
    }
    public String getDescription() {
        return "Your horse can now run 2X faster. Speed is now 25 mph";
               
    }
    
    public double getCost() {
        return tempBasicAnimal.getCost() + 200.00;
    }
    
    public double getBalance() {
        return tempBasicAnimal.getBalance() - 200.00;
    }

}
