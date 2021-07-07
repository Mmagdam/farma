import Ground.Ground;
import Buildings.Buildings;

import java.util.*;

public class Farm {



        public double price;
        public int groundSize;
        public static Ground[] ground = new Ground[5];
        public int buildingsNumber;
        public static Buildings[] buildings=new Buildings[5];



    public Farm(double price, int groundSize, int buildingsNumber, Ground[]ground, Buildings[]buildings){
        this.price = price;
        this.groundSize = groundSize;
        this.buildingsNumber=buildingsNumber;
        this.ground=ground;
        this.buildings=buildings;

    }

public void Farm(){
        farm1.buildings[0] =Buildings.barn;
        farm3.buildings[0]=Buildings.stable;
        farm3.buildings[1]=Buildings.cowshed;
        farm3.buildings[2]=Buildings.rabbitCage;
        farm4.buildings[0]=Buildings.barn;
        farm4.buildings[1]=Buildings.chickenCoop;
        farm1.ground[0]=Ground.ground;
        }


        public static Farm farm1 = new Farm(13000, 1, 1,ground, buildings);
        public Farm farm2 = new Farm(20000, 2, 0,null, null);
        public Farm farm3 = new Farm(20000, 1, 3,null, null);
        public Farm farm4 = new Farm(25000, 2, 3,null, null);


        public void getFarm() {
            Farm[] farm = {farm1, farm2, farm3, farm4};
        Random rand = new Random();
        int i = rand.nextInt(farm.length-1);
        int j = rand.nextInt(farm.length-1);
        do j = rand.nextInt(farm.length-1);while(j==i);
        int k = rand.nextInt(farm.length-1);
        do k = rand.nextInt(farm.length-1);while(k==i||k==j);
            System.out.println("Farma nr 1:"+farm[0]);
            System.out.println("Farma nr 2:"+farm[1]);
            System.out.println("Farma nr 3:"+farm[2]);
        }

    public static void buyFarm() {
    }

    public String toString() {
        return "Price:"+ price + ", Ground size:" + groundSize + ", Buildings number:"+buildingsNumber+", Ground:"+ground+", Buildings:"+buildings;

    }

}

