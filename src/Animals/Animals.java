package Animals;

public class Animals {
        public double price; //koszt zakupu
        public double weightRate; //tempo przybierania na wadze na tydzien
        public int growingUpTime; //czas wzrostu do dojrzalosci w tygodniach
        public double foodAmount; //ilość jedzenia jaką musisz dostarczyć na tydzien
        public String foodType; //rodzaje jedzenia jakie to zwierze akceptuje
        public boolean reproduce; //szanse na rozmnozenie

        public Animals(double price, double weightRate, int growingUpTime, double foodAmount, String foodType, boolean reproduce) {
            this.price = price;
            this.weightRate = weightRate;
            this.growingUpTime = growingUpTime;
            this.foodAmount = foodAmount;
            this.foodType = foodType;
            this.reproduce = reproduce;
        }

}
