package com.info.jjd.lesson5.task2;

import java.util.Arrays;
import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int speedCat;
    private int weight;
    private Mouse[] mousses;

    public Cat(String name, String color, int speedCat, int weight, int catchMousses) {
        setName(name);
        setColor(color);
        setSpeedCat(speedCat);
        setWeight(weight);
        if (catchMousses > 100) throw new IllegalArgumentException("catchMousses > 100");
        mousses = new Mouse[catchMousses];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name,"name не может быть null");
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Objects.requireNonNull(color,"color не может быть null");
        this.color = color;
    }

    public int getSpeedCat() {
        return speedCat;
    }

    public void setSpeedCat(int speedCat) {
        if (speedCat <= 0) throw new IllegalArgumentException("speedCat <= 0");
        this.speedCat = speedCat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) throw new IllegalArgumentException("weight <= 0");
        this.weight = weight;
    }

    public Mouse[] getMousses() {
        return mousses;
    }

    public boolean catchMousses(Mouse mouse) {
        if (speedCat > mouse.getSpeedMouse()) {
            for (int i = 0; i < mousses.length; i++) {
                if (mousses[i] == null) {
                    mousses[i] = mouse;
                    return true;
                }
            }
        }
        return false;
    }

    public void attackCat(Cat cat) {
        int index = 0;
        if (weight > cat.weight) {
            for (int i = 0; i < cat.mousses.length; i++) {
                if (catchMousses(cat.mousses[i])) {
                    mousses[i] = cat.mousses[index];
                    index++;
                } else System.out.println("Мышка " + cat.mousses[i] + "убежала");
            }

        } else System.out.println("Коту не по силам ");

        for (int j = 0; j < cat.mousses.length; j++) {
            if (cat.mousses[j] != null) {
                cat.mousses[j] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speedCat=" + speedCat +
                ", weight=" + weight +
                ", mousses=" + Arrays.toString(mousses) +
                '}';
    }
}
