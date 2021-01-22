package boat;


// Created By: Abdallah Ibrahim

public class MotorBoat {

    private double capacity;
    private double fuelAmount;
    private double maxSpeed;
    private double currSpeed;
    private double efficiency;
    private double distance;

    MotorBoat(double cap, double amt, double maxS, double currS, double e, double d) {
        capacity = cap;
        fuelAmount = amt;
        maxSpeed = maxS;
        efficiency = e;
        distance = d;
    }

    public void changeSpeed(double speed) {
        currSpeed = speed;
    }

    public void operateBoat(double time) {
        
        distance = currSpeed * time;
        double fuelburn = distance / efficiency;
        if (fuelburn > fuelAmount) {
            System.out.println("Can not Operate Less Fuel!");
        } else {
            System.out.println("The boat can operate..");
        }
    }

    public void setfuelAmount(double fuel) {
        fuelAmount = fuel;
    }

    public double getfuelAmount() {
        return fuelAmount;
    }

    public double getdistance() {
        return distance;
    }
}
