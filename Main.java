package Garage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Garage g1 = new Garage(5);
        for(int i = 0; i < 3; i ++){
            Car toPark = new Car("Car" + i);
            g1.park(toPark, i);
        }
        System.out.println(Arrays.toString(g1.garage));

        Garage g2 = new Garage(5);
        for(int i = 0; i < 5;i ++){
            //g2.garage[i] = g1.garage[i];
            g2.garage[i] = new Car(g1.garage[i]);
        }
        System.out.println(Arrays.toString(g2.garage));

    }
}
