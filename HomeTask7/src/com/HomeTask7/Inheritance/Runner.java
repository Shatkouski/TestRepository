package com.HomeTask7.Inheritance;

public class Runner {
    public static void main(String[] args) {

        Truck truck = new Truck("Volvo", "SD 500",EngineType.DIEZEL,300,500,1000);
        truck.start();
        truck.eccelerate(40);
        truck.stop();
        truck.fuelUP(150);
        truck.load();
        truck.unload();

        System.out.println("-------------------------------------------------");

        ElectricCar car = new ElectricCar("Tesla","S",EngineType.ELECTRIC,100);
        car.start();
        car.stop();
        car.charge();

        System.out.println("--------------------------------------------------");


        Bus bus = new Bus("Mercedes","Sprinter",EngineType.PETROL,70,120,19);
        bus.start();
        bus.fuelUp();
        bus.stop();
        bus.pickUpPassengers(12);
        bus.releasePassengers();


    }
}
