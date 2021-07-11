package Main;

import Animals.Animals;
import Buildings.Buildings;
import Ground.Ground;
import Plants.Plants;

import javax.swing.plaf.basic.BasicButtonUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        boolean ifEnd=false;
        int whichWeek=0;
        int whichYear=1;

        Farmer farmer = new Farmer(null, null, 40000.0, null);

        System.out.println("Podaj imie:");
        String firstName = getString();
        farmer.firstName=firstName;

        System.out.println("Podaj nazwisko:");
        String lastName = getString();
        farmer.lastName=lastName;
        ArrayList<Ground> farmerGround=new ArrayList<Ground>();
        ArrayList<Buildings> farmerBuildings=new ArrayList<Buildings>();
        ArrayList<Plants> farmerPlants=new ArrayList<Plants>();
        ArrayList<Animals> farmerAnimals=new ArrayList<Animals>();

        Farm farm=new Farm(0.0,0, 0, farmerGround, farmerBuildings, farmerPlants, farmerAnimals);
        Buildings building=new Buildings(0, 0, null);
        do{
            whichWeek++;
            if(whichWeek>52) {
                whichWeek=1;
                whichYear++;
            }
            System.out.println("Mamy "+whichWeek+ " tydzien roku "+whichYear);
            boolean roundEnd=false;
        do {
            System.out.println("Wybierz co chcesz zrobic:\n1. Kup farme\n2. Kup/sprzedaj ziemie uprawna\n" +
                    "3. Kup nowy budynek\n4. Kup zwierzeta/rosliny\n5. Posadz rosliny\n6. Zbierz plony\n" +
                    "7. Sprzedaj rosliny/zwierzeta\n8. Sprawdz stan zapasow\n9. Przejrzyj informacje o posiadanych zwierzetach\n" +
                    "10. Przejrzyj informacje o posiadanych sadzonkach i zasadzonych roslinach\n11. Przejdz do kolejnego tygodnia");
            int wybor = getInt();
            switch (wybor) {
                case 1:
                    farm = farm.getFarm();
                    Farm.buyFarm(farmer, farm);
                    break;
                case 2:
                    System.out.println("Wybierz:\n1. Kup ziemie uprawna\n2. Sprzedaj ziemie uprawna");
                    wybor = getInt();
                    switch (wybor) {
                        case 1:
                            Ground.buyGround(farmer, Ground.ground, farmerGround);
                            break;
                        case 2:
                            if (farmer.farm.ground != null)
                                Ground.sellGround(farmer, Ground.ground);
                            else System.out.println("Nie masz ziemi na sprzedaz!");
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    break;
                case 3:
                    System.out.println("Wybierz jaki budynek chcesz kupic:\n1. Barn\n2. Chicken Coop\n3. Cowshed\n4. Pigsty\n5. Rabbit Cage\n6. Stable");
                    wybor = getInt();
                    switch (wybor) {
                        case 1:
                            building = Buildings.barn;
                            break;
                        case 2:
                            building = Buildings.chickenCoop;
                            break;
                        case 3:
                            building = Buildings.cowshed;
                            break;
                        case 4:
                            building = Buildings.pigsty;
                            break;
                        case 5:
                            building = Buildings.rabbitCage;
                            break;
                        case 6:
                            building = Buildings.stable;
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    Buildings.buyBuilding(farmer, building);
                    break;
                case 4:
                    System.out.println("Wybierz:\n1. Kup zwierzeta\n2. Kup rosliny");
                    wybor = getInt();
                    switch (wybor) {
                        case 1:
                            Animals.buyAnimals(farmer, farm);
                            break;
                        case 2:
                            Plants.buyPlants(farmer, farm);
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    break;
                case 5:
                    Plants.plantPlants(farmer, farm);
                    break;
                case 6:
                    Plants.harvestCrop();
                    break;
                case 7:
                    System.out.println("Wybierz:\n1. Sprzedaj zwierzeta\n2. Sprzedaj rosliny");
                    wybor = getInt();
                    switch (wybor) {
                        case 1:
                            Animals.sellAnimals();
                            break;
                        case 2:
                            Plants.sellPlants();
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    break;
                case 8:
                    Plants.stockStatus();
                    break;
                case 9:
                    Animals.animalInfo();
                    break;
                case 10:
                    Plants.plantInfo();
                    break;
                case 11:
                    roundEnd = true;
                    break;
                default:
                    System.out.println("Wybrales/as zla opcje!");
            }

            System.out.println(farmer.farm);

        }while(roundEnd==false);
        
    }while(ifEnd==false);
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}

