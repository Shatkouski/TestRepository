package com.HomeTask7.Inheritance;

public class ElectricCar extends Car{

    private int batteryVolume;

    public ElectricCar(String producer, String model, EngineType engineType,int batteryVolume) {
        super(producer, model, engineType);
        this.batteryVolume = batteryVolume;
    }





    public void  charge(){
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }
}
