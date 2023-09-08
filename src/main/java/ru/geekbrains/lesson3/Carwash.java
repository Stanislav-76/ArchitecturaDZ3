package ru.geekbrains.lesson3;

public class Carwash implements Wiping {

    @Override
    public void washCar() {
        System.out.println("Автомобиль помыт");
    }

    @Override
    public void cleanCar() {
        System.out.println("Автомобиль очищен (включая салон).");
    }

    @Override
    public void wipMirrors() {
        System.out.println("Зеркала протерты.");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Лобовое стекло протерто.");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Фары протерты.");
    }
}
