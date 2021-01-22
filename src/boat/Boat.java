package boat;

import java.util.Scanner;

// Created By: Abdallah Ibrahim 

public class Boat {

    public static void main(String[] args) {
        double cap, fa, ms, cs, eff, dis;

        System.out.println("Enter the Capacity of the boat: ");
        Scanner sc = new Scanner(System.in);
        cap = sc.nextDouble();

        System.out.println("Enter the Amount of the fuel in the tank: ");
        fa = sc.nextDouble();

        System.out.println("Enter the Maximum speed of the boat: ");
        ms = sc.nextDouble();

        System.out.println("Enter the Current speed of the boat: ");
        cs = sc.nextDouble();

        System.out.println("Enter the Efficiency of the boat: ");
        eff = sc.nextDouble();

        System.out.println("Enter the Distance travelled: ");
        dis = sc.nextDouble();

        MotorBoat mb = new MotorBoat(cap, fa, ms, cs, eff, dis);

        System.out.println("Fuel Amount: " + mb.getfuelAmount());

        mb.setfuelAmount(100);

        System.out.println("After set Fuel Amount: " + mb.getfuelAmount());

        mb.operateBoat(1);

        System.out.println("Distance Travel so far: " + mb.getdistance());

    }

}
