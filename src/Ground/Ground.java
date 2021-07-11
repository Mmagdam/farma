package Ground;
import Main.Farmer;
import Plants.Plants;


import java.util.ArrayList;
import java.util.Scanner;
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

        public static void buyGround(Farmer farmer, Ground ground, ArrayList<Ground>farmerGround) {
                if(farmerGround.size()>9) {
                        System.out.println("Nie mozesz kupic wiecej ziemi!");
                }
                        else{
                if(farmerGround==null){
                        if(farmer.wallet>=ground.price){
                                farmerGround.add(ground);
                                farmer.wallet=farmer.wallet-ground.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te ziemie!");}
                else{
                        if(farmer.wallet>=ground.price){
                                farmerGround.add(ground);
                                farmer.wallet=farmer.wallet-ground.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te ziemie!");}}


        }

        public static void sellGround(Farmer farmer, Ground ground) {
                int length = farmer.farm.ground.size();
                System.out.println("Twoje ziemie to:" + farmer.farm.ground);
                System.out.println("Wybierz ziemie na sprzedaz od 0 do " + length);
                int choose = getInt();
                if (choose > length) {
                        System.out.println("Wybrales/las zla opcje!");
                } else {
                        farmer.farm.ground.remove(choose);
                        System.out.println("Twoja ziemia zostala sprzedana!");
                }
        }

        public String toString() {
                return "Size:"+ size + ", Price:" + price + ", What Sown:" +whatSown;

        }
        public static int getInt() {
                return new Scanner(System.in).nextInt();
        }
        public static String getString() {
                return new Scanner(System.in).next();
        }

}
