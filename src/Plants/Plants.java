package Plants;

public class Plants {
        double preparationCost; //koszt przygotowania ziemi i sadzenia (w przeliczeniu na hektar)
        double protectionCost; //koszt ochrony przed szkodnikami (w przeliczeniu na hektar)
        double yield; //wydajnosc upraw w tonach z hektara (ile mozesz zebrac gotowego towaru)
        int growthLength; //dlugosc okresu od posadzenia do zbiorow w tygodniach
        String info; //informacje o tym w ktorych tygodniach roku mozna siac/sadzic
        double harvestCost; //koszt zbioru (w przeliczeniu na hektar)
        double price; //cene skupu kilograma
        public Plants (double preparationCost, double protectionCost, double yield, int growthLength, String info, double harvestCost, double price){
                this.preparationCost=preparationCost;
                this.protectionCost=protectionCost;
                this.yield=yield;
                this.growthLength=growthLength;
                this.info=info;
                this.harvestCost=harvestCost;
                this.price=price;
        }



}
