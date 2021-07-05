import Buildings.Buildings;
import Ground.Ground;
import Buildings.Barn;
import java.util.Random;

import java.util.logging.StreamHandler;

public class Farm {

    double price;
    int groundSize;
    int buildingsNumber;
    Buildings[] buildings = new Buildings[buildingsNumber];
    Ground[] ground = new Ground[groundSize];

    public Farm(double price, int groudnSize, int buildingsNumber, Buildings[] buildings, Ground[] ground){
        this.price=price;
        this.groundSize=groudnSize;
        this.buildingsNumber=buildingsNumber;
        this.buildings=buildings;
        this.ground=ground;
    }
    static Farm[] farm=new Farm[10];

    public static Farm getFarm() {
        Random rand = new Random();
        int i = rand.nextInt()*10;
        return farm[i];
    }

}
