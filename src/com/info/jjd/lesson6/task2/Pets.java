package com.info.jjd.lesson6.task2;

public class Pets {
    private String type;
    private int weight;
    private int speed;
    private int health;
    private int resources;
    private boolean fit;


    public Pets(String type, int weight, int speed, int health, int resources, boolean fit) {
        this.type = type;
        this.weight = weight;
        this.speed = speed;
        this.health = health;
        this.resources = resources;
        this.fit = fit;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public boolean isFit() {
        return fit;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", health=" + health +
                '}';
    }
}
