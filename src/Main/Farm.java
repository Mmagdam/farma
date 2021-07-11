package Main;

import Animals.Animals;
import Ground.Ground;
import Buildings.Buildings;
import Plants.Plants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Farm {


        Random rnd = new Random();
        public double price;
        public int groundSize=0;
        public int buildingsNumber=0;
        public static ArrayList<Ground> ground=new ArrayList<Ground>();
        public static ArrayList<Buildings> buildings=new ArrayList<Buildings>();
        public static ArrayList<Plants> plants=new ArrayList<Plants>();
        public static ArrayList<Animals> animals=new ArrayList<Animals>();




    public Farm(double price, int groundSize, int buildingsNumber, ArrayList<Ground>ground, ArrayList<Buildings>buildings, ArrayList<Plants> plants, ArrayList<Animals>animals){
        this.price = price;
        this.groundSize = groundSize;
        this.buildingsNumber=buildingsNumber;
        this.ground=ground;
        this.buildings=buildings;
        this.plants=plants;
        this.animals=animals;

    }

        public ArrayList<Buildings>RandomBuildings(int size){
        int number = 0;
        Buildings[] buildingsArray = {Buildings.barn,Buildings.stable, Buildings.cowshed, Buildings.rabbitCage, Buildings.chickenCoop};
        int max = buildingsArray.length;
        ArrayList<Buildings> buildingsList = new ArrayList<Buildings>();
        while (size>0){
            number=rnd.nextInt(max);
            if(!buildingsList.contains((buildingsArray[number]))){
                buildingsList.add(buildingsArray[number]);
                size--;
            }
        }
        return buildingsList;
        }

        public Farm getFarm(){
        Farm farm1= new Farm(13000, 1, 1,ground, RandomBuildings(1), plants, animals);
        RandomBuildings(1);
        Farm farm2= new Farm(13000, 1, 3,ground, RandomBuildings(3), plants, animals);
        RandomBuildings(3);
        Farm farm3= new Farm(13000, 1, 3,ground, RandomBuildings(3), plants, animals);
        RandomBuildings(3);
        Farm farm4= new Farm(13000, 1, 3,ground, RandomBuildings(3), plants, animals);
        RandomBuildings(3);
        Farm[] farm = {farm1, farm2, farm3, farm4};
        Farm farms=new Farm(0.0,0,0,null, null, null, null);
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

