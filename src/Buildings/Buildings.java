package Buildings;




public class Buildings {

    public int size; //rozmiar budynku
    public double price; //cena budynku
    public String name; //nazwa budynku

    public Buildings(double price, int size, String name){
        this.price=price;
        this.size=size;
        this.name=name;
    }
    public static Barn barn=new Barn(3000, 1, "Barn");
    public static ChickenCoop chickenCoop=new ChickenCoop(2000, 1, "Chicken Coop");
    public static Cowshed cowshed=new Cowshed(4000, 1, "Cowshed");
    public static Pigsty pigsty=new Pigsty(3500, 1, "Pigsty");
    public static RabbitCage rabbitCage=new RabbitCage(1000, 1, "Rabbit Cage");
    public static Stable stable=new Stable(5000, 1, "Stable");

    public static void buyBuilding() {
    }

    public String toString() {
        return "Size:"+ size + ", Price:" + price + ", Name:" +name;

    }
}
