package animalstrategypattern;

/**Interface used to determine animal type using the STRATEGY PATTERN.*/
public interface AnimalType {
    String AType();
}

/** Class isPreditor determines the animal type
preditor implementing Animal Type Interface.*/
class isPreditor implements AnimalType {   
    public String AType() {
    return "Is a preditor";
    }
    
}

/** Class isFarmAnimal determines the animal type
farm animal implementing Animal Type Interface.*/
class isFarmAnimal implements AnimalType {    
    public String AType() {
    return "Is a farm animal";
    }

/** Class isCropPreditor determines the animal type
crop preditor animal implementing Animal Type Interface.*/
class isCrop implements AnimalType {       
        public String AType() {
        return "Is a crop eater.";
        }
    }
}
    
