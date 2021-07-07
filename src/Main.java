import Animals.Animals;
import Buildings.Buildings;
import Ground.Ground;
import Plants.Plants;

import javax.swing.plaf.basic.BasicButtonUI;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        boolean ifEnd=false;
        Scanner scanner = new Scanner(System.in);
        Farmer farmer = new Farmer(null, null, 20000.0, null);

        System.out.println("Podaj imie:");
        String firstName = scanner.nextLine();
        farmer.firstName=firstName;

        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        farmer.lastName=lastName;
        System.out.println(Farm.farm1);

        do{
            boolean roundEnd=false;
        do {
            System.out.println("Wybierz co chcesz zrobic:\n1. Kup farme\n2. Kup/sprzedaj ziemie uprawna\n" +
                    "3. Kup nowy budynek\n4. Kup zwierzeta/rosliny\n5. Posadz rosliny\n6.Zbierz plony\n" +
                    "7. Sprzedaj rosliny/zwierzeta\n8. Sprawdz stan zapasow\n9. Przejrzyj informacje o posiadanych zwierzetach\n" +
                    "10. Przejrzyj informacje o posiadanych sadzonkach i zasadzonych roslinach\n11. Przejdz do kolejnego tygodnia");
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    Farm.buyFarm();
                    break;
                case 2:
                    System.out.println("Wybierz:\n1. Kup ziemie uprawna\n2. Sprzedaj ziemie uprawna");
                    wybor = scanner.nextInt();
                    switch (wybor){
                        case 1:
                            Ground.buyGround();
                            break;
                        case 2:
                            Ground.sellGround();
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    break;
                case 3:
                    Buildings.buyBuilding();
                    break;
                case 4:
                    System.out.println("Wybierz:\n1. Kup zwierzeta\n2. Kup rosliny");
                    wybor = scanner.nextInt();
                    switch (wybor){
                        case 1:
                            Animals.buyAnimals();
                            break;
                        case 2:
                            Plants.buyPlants();
                            break;
                        default:
                            System.out.println("Wybrales/las zla opcje!");
                    }
                    break;
                case 5:
                    Plants.plantPlants();
                    break;
                case 6:
                    Plants.harvestCrop();
                    break;
                case 7:
                    System.out.println("Wybierz:\n1. Sprzedaj zwierzeta\n2. Sprzedaj rosliny");
                    wybor = scanner.nextInt();
                    switch (wybor){
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
                    roundEnd=true;
                    break;
                default:
                    System.out.println("Wybrales/as zla opcje!");
            }

        }while(roundEnd==false);
    }while(ifEnd==false);
    }


}

