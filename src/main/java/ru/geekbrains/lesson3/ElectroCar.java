package ru.geekbrains.lesson3;

import java.awt.*;

public class ElectroCar extends Car implements Wiping {

    private Wiping wiping;

    public ElectroCar (String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }
    public void setCarwash(Wiping carwash) {
        this.wiping = carwash;
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
