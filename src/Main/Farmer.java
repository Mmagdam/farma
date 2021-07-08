package Main;

import Main.Farm;

public class Farmer {
    public String firstName;
    public String lastName;
    public Double wallet;
    public Farm farm;

    public Farmer(String firstName, String lastName, Double wallet, Farm farm){
        this.firstName=firstName;
        this.lastName=lastName;
        this.wallet=wallet;
        this.farm=farm;
    }
    @Override
    public String toString() {
        return "Main.Farmer:\nFirst name:"+ firstName + ", Last name:" + lastName + ", Wallet:" +wallet+", Main.Farm:"+farm;

    }
}

