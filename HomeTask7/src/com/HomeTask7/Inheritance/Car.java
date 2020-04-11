package com.HomeTask7.Inheritance;

public class Car extends Auto {

    private int passengersNumber;
    private int countentDoors;

    public Car(String producer, String model, EngineType engineType) {
        super(producer, model, engineType);
    }

    public int getCountentDoors() {
        return countentDoors;
    }

    public void setCountentDoors(int countentDoors) {
        this.countentDoors = countentDoors;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
