package task2.Transport;

import java.sql.SQLOutput;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineCapacity;
    private double bestLapTime;
    private double maxSpeed;


    public Transport(String brand, String model, double engineCapacity) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (engineCapacity <= 0) {
            this.engineCapacity = 0;
        } else {
            this.engineCapacity = engineCapacity;
        }

        setBestLapTime(bestLapTime);

        setMaxSpeed(maxSpeed);
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void finish() {
        System.out.println("Закончить движение");
    }

    public abstract boolean diagnostics();

    @Override
    public String toString() {
        return "Марка - " + this.getBrand() + ", модель - " + this.getModel() + ", объём двигателя - " + this.getEngineCapacity()
                + ", лучшее время - " + this.getBestLapTime() + ", максимальная скорость - " + this.getMaxSpeed();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        if (bestLapTime <= 0) {
            this.bestLapTime = 0;
        } else {
            this.bestLapTime = bestLapTime;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
