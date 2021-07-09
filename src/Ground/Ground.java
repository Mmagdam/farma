package Ground;
import Main.Farmer;
import Plants.Plants;


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

        public static void buyGround(Farmer farmer, Ground ground, Ground[] farmerGround) {
                if(farmerGround.length>9) {
                        System.out.println("Nie mozesz kupic wiecej ziemi!");
                }
                        else{
                if(farmerGround==null){
                        if(farmer.wallet>=ground.price){
                                farmerGround[0]=ground;
                                farmer.wallet=farmer.wallet-ground.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te ziemie!");}
                else{
                        int length=farmerGround.length;
                        if(farmer.wallet>=ground.price){
                                farmerGround[length]=ground;
                                farmer.wallet=farmer.wallet-ground.price;
                        }
                        else System.out.println("Masz za malo pieniedzy, zeby kupic te ziemie!");}}


        }

        public static void sellGround(Farmer farmer, Ground ground) {
                int length=farmer.farm.ground.length;
                if(length>0){
                        System.out.println("Twoje ziemie to:"+farmer.farm.ground);
                        System.out.println("Wybierz ziemie na sprzedaz od 0 do "+length);
                        int choose = getInt();
                        if(choose>length){
                                System.out.println("Wybrales/las zla opcje!");
                        }
                        else{
                                for(int i=choose;i<length-choose;i++){
                                        farmer.farm.ground[i]=farmer.farm.ground[length+i-choose];
                                }
                                System.out.println("Twoja ziemia zostala sprzedana!");
                        }
                }
                else System.out.println("Nie masz ziemi na sprzedaz!");
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
