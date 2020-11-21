package farmfactory;

public abstract class Farm {
    
    private String farmType;
    private int numAcres;
    private int numFarmers;
    private double passiveCurrency;
    private boolean newPassiveCurrency = false;
    
    public boolean getNewPassiveCurrency() {
        return newPassiveCurrency;
    }

    public void setNewPassiveCurrency(boolean newPassiveCurrency) {
        this.newPassiveCurrency = newPassiveCurrency;
    }

    public double upgrade;

    public String getFarmType() {
        return farmType;
    }
    
    public void setFarmType(String farmType) {
        this.farmType = farmType;
        
    }
    
    public int getNumAcres() {
        return numAcres;
    }
    
    public void setnumAcres(int numAcres) {
        this.numAcres = numAcres;
        
    }
    
    public int getNumFarmers() {
        return numFarmers;
    }

    public void setNumFarmers(int numFarmers) {
        this.numFarmers = numFarmers;
    }
    
    public double getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(double upgrade) {
        this.upgrade = upgrade;
    }
    
    public double getPassiveCurrency() {
        return passiveCurrency;
    }

    public void setPassiveCurrency(double passiveCurrency) {
        this.passiveCurrency = passiveCurrency;
    }
    
    public void displayFarm() {
        System.out.println("Your farm is " + getFarmType());
    }
    
    public void dislayAcres() {
        System.out.println("You have " + getNumAcres() + " Acres");
    }
    
    public void displayPassiveCurrency() {
        System.out.print("Your passive currency is " + getPassiveCurrency());
    }
    
    public double upgradePassiveCurrency() {
        if(passiveCurrency >= upgrade) {
            newPassiveCurrency = true;
            double passiveCurrencyUpgrage = passiveCurrency - upgrade;
            System.out.println("Upgrade complete! Your new balance is " + passiveCurrencyUpgrage);
            return passiveCurrencyUpgrage;
            
        }else {
            System.out.println("You do not have enough currency to upgrade. Your balance is " + passiveCurrency);
            return passiveCurrency;
        }
    
    }
    
    public int upgradeFarmers() {
        if(newPassiveCurrency == true) {
            numFarmers = numFarmers + 6;
            System.out.println("Congrats you increase your amount of farmers. Farmer employees are now " + numFarmers);
            return numFarmers;
        }else {
            System.out.println("You were unable to increase the number of farmers on your staff.");
        }
        return numAcres;
        
    }

 

   
    

}
