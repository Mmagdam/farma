public class Farmer {
    String firstName;
    String lastName;
    Double wallet;
    Farm farm;

    public Farmer(String firstName, String lastName, Double wallet, Farm farm){
        this.firstName=firstName;
        this.lastName=lastName;
        this.wallet=wallet;
        this.farm=farm;
    }
    @Override
    public String toString() {
        return "Farmer:\nFirst name:"+ firstName + ", Last name:" + lastName + ", Wallet:" +wallet+", Farm:"+farm;

    }
}

