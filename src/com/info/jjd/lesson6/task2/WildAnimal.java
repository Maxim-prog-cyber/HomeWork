package com.info.jjd.lesson6.task2;

import java.util.Objects;

public class WildAnimal {
    private String name;
    private int weight;
    private  int speed;
    private int power;

    public WildAnimal(String name, int weight, int power,int speed) {
        setName(name);
        setWeight(weight);
        setSpeed(speed);
        setPower(power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name,"name не может быть null");
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight <= 0) throw new IllegalArgumentException("Вес не может быть меньше или равен 0");
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) throw new IllegalArgumentException("Cкорость не может быть меньше или равен 0");
        this.speed = speed;
    }


    public void setPower(int power) {
        if (power <= 0) throw new IllegalArgumentException("сила не может быть меньше или равен 0");
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void killPet(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getSpeed() > this.speed){
                System.out.println(pets[i] + "Убежало");
            }
            else {
                pets[i].setHealth(0);
                pets[i].setOnFarm(false);
                return;
            }
        }
    }
    public void attackFarm(Farm farm) {//пока не понял как его реализовать

    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", power=" + power +
                '}';
    }
}
