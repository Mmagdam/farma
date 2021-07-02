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
    }
}

