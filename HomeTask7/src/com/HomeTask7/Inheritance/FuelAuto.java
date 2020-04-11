package com.HomeTask7.Inheritance;

public class FuelAuto extends  Auto {

    private int availablePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(producer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUP(int petrolVolume){
        availablePetrol+=petrolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
