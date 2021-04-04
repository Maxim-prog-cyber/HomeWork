package com.info.jjd.lesson6.task2;

import java.util.Objects;

public class Pets {
    private String type;
    private int weight;
    private int speed;
    private int health;
    private int resources;
    private boolean fit;
    private boolean onFarm;


    public Pets(String type, int weight, int speed, int health, int resources, boolean fit) {
        setType(type);
        setWeight(weight);
        setSpeed(speed);
        setHealth(health);
        setResources(resources);
        setHealth(health);
        setFit(fit);
        this.onFarm = true;
    }

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setType(String type) {
        Objects.requireNonNull(type,"type не может быть null");
        this.type = type;
    }

    public void setWeight(int weight) {
        if (weight <= 0) throw new IllegalArgumentException("Вес не может быть меньше или равно 0");
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) throw new IllegalArgumentException("Скорость не может быть меньше или равно 0");
        this.speed = speed;
    }

    public void setFit(boolean fit) {
        this.fit = fit;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        if (resources < 0) throw new IllegalArgumentException("Такого не может быть ");
        this.resources = resources;
    }

    public boolean isFit() {
        return fit;
    }

    public void setHealth(int health) {
        if (health <= 0) throw new IllegalArgumentException("Здоровье не может быть меньше или равно 0");
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public void run(WildAnimal wildAnimal) {
        if (wildAnimal.getSpeed() > speed) {
            System.out.println("съели");
        } else System.out.println("убежало");
    }


    public void eatPet() {
        if (this.health < Settings.MAX_HEALTH) { //написал так потому что не знаю как сравнить с изначальным значением здоровья
            this.health++;
        }
    }


    @Override
    public String toString() {
        return "Pets {" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", health=" + health +
                '}';
    }
}
