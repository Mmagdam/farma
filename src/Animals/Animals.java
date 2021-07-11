package Animals;

import Buildings.Buildings;
import Buildings.ChickenCoop;
import Main.Farm;
import Main.Farmer;
import Plants.Plants;

import java.util.Scanner;

import static Plants.Plants.clover;

public class Animals {

        public double price; //koszt zakupu
        public double weightRate; //tempo przybierania na wadze na tydzien
        public double weight; // obecna waga
        public int growingUpTime; //czas wzrostu do dojrzalosci w tygodniach
        public double foodAmount; //ilość jedzenia jaką musisz dostarczyć na tydzien
        public Plants foodType; //rodzaje jedzenia jakie to zwierze akceptuje
        public boolean reproduce; //szanse na rozmnozenie

        public Animals(double price, double weightRate, double weight, int growingUpTime, double foodAmount, Plants foodType, boolean reproduce) {
            this.price = price;
            this.weightRate = weightRate;
            this.weight=weight;
            this.growingUpTime = growingUpTime;
            this.foodAmount = foodAmount;
            this.foodType = foodType;
            this.reproduce = reproduce;
        }
        public static Cow cow = new Cow(500.0, 6.25, 40, 104, 15, Plants.clover, true);
        public static Pig pig = new Pig(300.0, 5, 25, 104, 3.5, Plants.beetRoot, true);
        public static Chicken chicken=new Chicken(100, 0.42, 1.6, 26, 0.7, Plants.beetRoot, false);
        public static Horse horse=new Horse(600,3, 60,208,7.5,Plants.clover, true);
        public static Rabbit rabbit=new Rabbit(50, 0.1, 0.06, 16, 0.04, Plants.lettuce, true);

    public static void buyAnimals(Farmer farmer, Farm farm) {
        int length = farmer.farm.animals.size();
        System.out.println("Wybierz zwierze jakie chcesz kupic:\n1. Chicken\n2. Cow\n3. Horse\n4. Pig\n5. Rabbit");
        int wybor = getInt();
        switch (wybor){
            case 1:
                for(int i=0; i<length; i++ ){
                if(farmer.farm.buildings.get(i)==Buildings.chickenCoop){
                    if(farmer.wallet>=chicken.price){
                        farmer.farm.animals.add(chicken);
                        farmer.wallet=farmer.wallet- chicken.price;
                    }
                    else System.out.println("Masz za malo pieniedzy, zeby kupic te zwierze");
                }
                else System.out.println("Nie masz odpowiedniego budynku, zeby kupic te zwierze!");
                }
            case 2:
                for(int i=0; i<length; i++ ){
                    if(farmer.farm.buildings.get(i)==Buildings.cowshed){
                        if(farmer.wallet>=cow.price){
                            farmer.farm.animals.add(cow);
                            farmer.wallet=farmer.wallet- cow.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te zwierze");
                    }
                    else System.out.println("Nie masz odpowiedniego budynku, zeby kupic te zwierze!");
                }
            case 3:
                for(int i=0; i<length; i++ ){
                    if(farmer.farm.buildings.get(i)==Buildings.stable){
                        if(farmer.wallet>=horse.price){
                            farmer.farm.animals.add(horse);
                            farmer.wallet=farmer.wallet- horse.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te zwierze");
                    }
                    else System.out.println("Nie masz odpowiedniego budynku, zeby kupic te zwierze!");
                }
            case 4:
                for(int i=0; i<length; i++ ){
                    if(farmer.farm.buildings.get(i)==Buildings.pigsty){
                        if(farmer.wallet>=pig.price){
                            farmer.farm.animals.add(pig);
                            farmer.wallet=farmer.wallet- pig.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te zwierze");
                    }
                    else System.out.println("Nie masz odpowiedniego budynku, zeby kupic te zwierze!");
                }
            case 5:
                for(int i=0; i<length; i++ ){
                    if(farmer.farm.buildings.get(i)==Buildings.rabbitCage){
                        if(farmer.wallet>=rabbit.price){
                            farmer.farm.animals.add(rabbit);
                            farmer.wallet=farmer.wallet- rabbit.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te zwierze");
                    }
                    else System.out.println("Nie masz odpowiedniego budynku, zeby kupic te zwierze!");
                }
            default:
                System.out.println("Wybrales/las zla opcje!");

    }}

    public static void sellAnimals() {

    }

    public static void animalInfo() {
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
