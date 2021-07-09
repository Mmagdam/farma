package Plants;

import Buildings.Buildings;
import Main.Farm;
import Main.Farmer;

import java.util.Scanner;

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

        int length = farmer.farm.plants.length;
        System.out.println("Wybierz rosliny jakie chcesz kupic(kilogram):\n1. Apple Tree\n2. Beetroot\n3. Clover\n4. Cucumber\n5. Lettuce");
        int wybor = getInt();
        for(int i=0; i<length; i++ ){
            if(farmer.farm.buildings[i]== Buildings.barn){


        switch (wybor){
            case 1:
                        if(farmer.wallet>= appleTree.price){
                                farmer.farm.plants[length]=appleTree;
                                farmer.wallet=farmer.wallet-appleTree.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                        break;
            case 2:
                if(farmer.wallet>= beetRoot.price){
                    farmer.farm.plants[length]=beetRoot;
                    farmer.wallet=farmer.wallet-beetRoot.price;
                }
                else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                break;
            case 3:
                if(farmer.wallet>= clover.price){
                    farmer.farm.plants[length]=clover;
                    farmer.wallet=farmer.wallet-clover.price;
                }
                else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                break;
            case 4:
                if(farmer.wallet>= cucumber.price){
                    farmer.farm.plants[length]=cucumber;
                    farmer.wallet=farmer.wallet- cucumber.price;
                }
                else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                break;
            case 5:
                if(farmer.wallet>= lettuce.price){
                    farmer.farm.plants[length]=lettuce;
                    farmer.wallet=farmer.wallet-lettuce.price;
                }
                else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                break;
            default:
                System.out.println("Wybrales/las zla opcje!");

        }}
        else System.out.println("Nie masz odpowiedniego budynku, zeby kupic rosliny!");
    }}

        public static void plantPlants(Farmer farmer, Farm farm) {
            int length = farmer.farm.plants.length;
            System.out.println("Wybierz rosliny jakie chcesz kupic(kilogram):\n1. Apple Tree\n2. Beetroot\n3. Clover\n4. Cucumber\n5. Lettuce");
            int wybor = getInt();
            for(int i=0; i<length; i++ ){
                if(farmer.farm.buildings[i]== Buildings.barn){


                    switch (wybor){
                        case 1:
                            if(farmer.wallet>= appleTree.price){
                                farmer.farm.plants[length]=appleTree;
                                farmer.wallet=farmer.wallet-appleTree.price;
                            }
                            else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                            break;
                        case 2:
                            if(farmer.wallet>= beetRoot.price){
                                farmer.farm.plants[length]=beetRoot;
                                farmer.wallet=farmer.wallet-beetRoot.price;
                            }
                            else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                            break;
                        case 3:
                            if(farmer.wallet>= clover.price){
                                farmer.farm.plants[length]=clover;
                                farmer.wallet=farmer.wallet-clover.price;
                            }
                            else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                            break;
                        case 4:
                            if(farmer.wallet>= cucumber.price){
                                farmer.farm.plants[length]=cucumber;
                                farmer.wallet=farmer.wallet- cucumber.price;
                            }
                            else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                            break;
                        case 5:
                            if(farmer.wallet>= lettuce.price){
                                farmer.farm.plants[length]=lettuce;
                                farmer.wallet=farmer.wallet-lettuce.price;
                            }
                            else System.out.println("Masz za malo pieniedzy, zeby kupic te rosliny");
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");

                    }}
                else System.out.println("Nie masz odpowiedniego budynku, zeby kupic rosliny!");
            }

        }

        public static void harvestCrop() {
        }

        public static void sellPlants() {
        }

    public static void stockStatus() {
    }

    public static void plantInfo() {
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
