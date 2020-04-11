package com.HomeTask7.Inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }


    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUP(volume);
    }

    @Override
    public void fuelUP(int petrolVolume) {
        int volume  = getAvailablePetrol() + petrolVolume;
        if (volume>getTankVolume()){
            setAvailablePetrol(getTankVolume());
            System.out.println("Tank Volume is FULL");
        }

    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking Up" + passengerNum + "passengers");

    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
