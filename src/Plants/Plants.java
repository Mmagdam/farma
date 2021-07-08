package Plants;

import Main.Farm;
import Main.Farmer;

public class Plants {
        double preparationCost; //koszt przygotowania ziemi i sadzenia (w przeliczeniu na hektar)
        double protectionCost; //koszt ochrony przed szkodnikami (w przeliczeniu na hektar)
        double yield; //wydajnosc upraw w tonach z hektara (ile mozesz zebrac gotowego towaru)
        int growthLength; //dlugosc okresu od posadzenia do zbiorow w tygodniach
        int info; //informacje o tym w ktorych tygodniach roku mozna siac/sadzic
        double harvestCost; //koszt zbioru (w przeliczeniu na hektar)
        double price; //cene skupu kilograma
        public Plants (double preparationCost, double protectionCost, double yield, int growthLength, int info, double harvestCost, double price){
                this.preparationCost=preparationCost;
                this.protectionCost=protectionCost;
                this.yield=yield;
                this.growthLength=growthLength;
                this.info=info;
                this.harvestCost=harvestCost;
                this.price=price;
        }
        public static AppleTree appleTree=new AppleTree(10000, 2000, 50, 208, 12, 2000, 2.5);
        public static BeetRoot beetRoot=new BeetRoot(8000, 3000, 60, 12, 12, 4000, 1);
        public static Cucumber cucumber=new Cucumber(9000, 4000, 60, 18, 8, 3000, 2);
        public static Clover clover=new Clover(3000, 1000, 20, 10, 8, 1200, 30);
        public static Lettuce lettuce=new Lettuce(3000, 1000, 20, 14, 6, 1000, 20);


    public static void buyPlants(Farmer farmer, Farm farm) {
    }

        public static void plantPlants() {
        }

        public static void harvestCrop() {
        }

        public static void sellPlants() {
        }

    public static void stockStatus() {
    }

    public static void plantInfo() {
    }
}
