package task2.Transport;

public class Car extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public boolean diagnostics() {
        return true;
    }

    @Override
    public String pitStop() {
        return null;
    }

    @Override
    public String bestLapTime() {
        return null;
    }

    @Override
    public String maxSpeed() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
