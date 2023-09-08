package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    private Refueling refueling;

    private Wiping wiping;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
        setFuelType(FuelType.Diesel);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setCarwash(Wiping carwash) {
        this.wiping = carwash;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }


    @Override
    public void washCar() {
        wiping.washCar();
    }

    @Override
    public void cleanCar() {
        wiping.cleanCar();
    }

    @Override
    public void wipMirrors() {
        wiping.wipMirrors();
    }

    @Override
    public void wipWindshield() {
        wiping.wipWindshield();
    }

    @Override
    public void wipHeadlights() {
        wiping.wipHeadlights();
    }


}
