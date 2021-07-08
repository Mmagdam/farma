package Animals;

import Main.Farm;
import Main.Farmer;
import Plants.Plants;

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
        Cow cow = new Cow(500.0, 6.25, 40, 104, 15, Plants.clover, true);
        Pig pig = new Pig(300.0, 5, 25, 104, 3.5, Plants.beetRoot, true);
        Chicken chicken=new Chicken(100, 0.42, 1.6, 26, 0.7, Plants.beetRoot, false);
        Horse horse=new Horse(600,3, 60,208,7.5,Plants.clover, true);
        Rabbit rabbit=new Rabbit(50, 0.1, 0.06, 16, 0.04, Plants.lettuce, true);

    public static void buyAnimals(Farmer farmer, Farm farm) {

    }

    public static void sellAnimals() {
    }

    public static void animalInfo() {
    }
}
