package Main;

import Animals.Animals;
import Ground.Ground;
import Buildings.Buildings;
import Plants.Plants;
import java.util.Random;
import java.util.Scanner;
public class Farm {



        public double price;
        public int groundSize;
        public static Ground[] ground = new Ground[9];
        public int buildingsNumber;
        public static Buildings[] buildings=new Buildings[9];
        public static Plants[] plants=new Plants[9];
        public static Animals[] animals=new Animals[9];



    public Farm(double price, int groundSize, int buildingsNumber, Ground[]ground, Buildings[]buildings, Plants[]plants, Animals[]animals){
        this.price = price;
        this.groundSize = groundSize;
        this.buildingsNumber=buildingsNumber;
        this.ground=ground;
        this.buildings=buildings;
        this.plants=plants;
        this.animals=animals;

    }

/*public void Farm(){
        farm1.buildings[0] =Buildings.barn;
        farm3.buildings[0]=Buildings.stable;
        farm3.buildings[1]=Buildings.cowshed;
        farm3.buildings[2]=Buildings.rabbitCage;
        farm4.buildings[0]=Buildings.barn;
        farm4.buildings[1]=Buildings.chickenCoop;
        farm1.ground[0]=Ground.ground;
        }*/


        public static Farm farm1 = new Farm(13000, 1, 1,ground, buildings, plants, animals);
        public static Farm farm2 = new Farm(20000, 2, 0,ground, buildings, plants, animals);
        public static Farm farm3 = new Farm(20000, 1, 3,ground, buildings, plants, animals);
        public static Farm farm4 = new Farm(25000, 2, 3,ground, buildings, plants, animals);


        public Farm getFarm() {
            Farm[] farm = {farm1, farm2, farm3, farm4};
            Farm farms=new Farm(0.0,0, 0, null, null, null, null);
        Random rand = new Random();
        int i = rand.nextInt(farm.length-1);
        int j = rand.nextInt(farm.length-1);
        do j = rand.nextInt(farm.length-1);while(j==i);
        int k = rand.nextInt(farm.length-1);
        do k = rand.nextInt(farm.length-1);while(k==i||k==j);
            System.out.println("Wybierz jedną z trzech farm:");
            System.out.println("Farma nr 1:"+farm[i]);
            System.out.println("Farma nr 2:"+farm[j]);
            System.out.println("Farma nr 3:"+farm[k]);
            int choose = getInt();
            switch (choose){
                case 1:
                    farms=farm[i];
                    break;
                case 2:
                    farms=farm[j];
                    break;
                case 3:
                    farms=farm[k];
                    break;
                default:
                    System.out.println("Wybrales/las zla opcje!");
            }
            return farms;
        }

    public static void buyFarm(Farmer farmer, Farm farm) {
    if(farmer.wallet>=farm.price){
        farmer.farm=farm;
        farmer.wallet=farmer.wallet-farm.price;
    }
    else System.out.println("Masz za malo pieniedzy, zeby kupic te farme!");
    }

    public String toString() {
        return "Price:"+ price + ", Ground size:" + groundSize + ", Buildings number:"+buildingsNumber+", Ground:"+ground+", Buildings:"+buildings;

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }

}

