package com.info.jjd.lesson6.task2;


import java.util.Arrays;
import java.util.Objects;

public class Farmer {
    private int resources;
    private int count = 0;

    public Farmer() {
        this.resources = Settings.START_RESOURCES_FARMER;
    }

    public void setResources(int resources) {
        if (resources < 0) throw new IllegalArgumentException("Такого не может быть ");
        this.resources = resources;
    }

    public int getResources() {
        return resources;
    }

    public void pickResources(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getResources() > 0) {
                this.resources += pets[i].getResources();
                pets[i].setResources(0);
            }
        }
    }

    public void eatPets(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) if (pets[i].getResources() > 0) return;

        for (int j = 0; j < pets.length; j++) {
            if (pets[j].isFit()) {
                pets[j].setHealth(0);
                this.resources += pets[j].getWeight();
                System.out.println(pets[j] + " Съедено");

                pets[j].setOnFarm(false); //домашнее животное не на ферме
                pets[j] = null;
                System.out.println(Arrays.toString(pets));// для проверки
                return;
            }
        }
    }

    public void driveAwayWildAnimal(WildAnimal wildAnimal) {
        Objects.requireNonNull(wildAnimal, "wildAnimal не может быть null");

        System.out.println("Пойди прочь " + wildAnimal);
        if (count == Settings.MAX_COME_TO_FARM) {
            System.out.println(wildAnimal + " Больше сюда не вернется");

        }
        count++;

    }

    public void feedAnimals(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getHealth() != 0) {
                pets[i].setHealth(Settings.MAX_HEALTH);//пополнил до максимального не изначального здовроья
            }
        }
        System.out.println(Arrays.toString(pets));
    }
}
