package com.HomeTask7.Inheritance;

public class Auto {

    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is start");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void eccelerate(int kmPerHours) {
        currentSpeed += kmPerHours;
        System.out.println("Accelerating. Current speed is" + currentSpeed + "KmPerHours");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
