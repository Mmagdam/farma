package Ground;

import Plants.Plants;

public class Ground {

        int size; //(jedna jednostka to jeden hektar)
        double price; //(cena)
        Plants whatSown=null; //co jest zasiane
        public Ground(int size, double price, Plants whatSown){
                this.size=size;
                this.price=price;
                this.whatSown=whatSown;
        };
        public static Ground ground=new Ground(1, 10000, null);

        public static void buyGround() {
        }

        public static void sellGround() {
        }

        public String toString() {
                return "Size:"+ size + ", Price:" + price + ", What Sown:" +whatSown;

        }


}
