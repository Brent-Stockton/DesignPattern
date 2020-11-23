package affinitydecorator;

public class CowGrow extends AnimalDecorator {

    public CowGrow(Animal newAnimal) {
        super(newAnimal);
        // TODO Auto-generated constructor stub
    }
    public String getDescription() {
        return "Your cow has grown bigger. Can now run 2X as much Milk and Dairy";
               
    }
    
    public double getCost() {
        return tempBasicAnimal.getCost() + 300.00;
    }
    
    public double getBalance() {
        return tempBasicAnimal.getBalance() - 300.00;
    }

}
