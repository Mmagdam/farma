import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Farmer farmer = new Farmer(null, null, 20000.0, null);

        System.out.println("Podaj imie:");
        String firstName = scanner.nextLine();
        farmer.firstName=firstName;

        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        farmer.lastName=lastName;

        System.out.println(farmer);

        System.out.println("Wybierz farmę: 1, 2 lub 3:");
        int wybor = scanner.nextInt();
        switch (wybor){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Wybrales/as zla opcje!");
        }


    }


}

