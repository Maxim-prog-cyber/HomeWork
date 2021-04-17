package com.info.jjd.lesson13;

import java.util.Comparator;
import java.util.TreeSet;

public class CarComparing {
    public static void main(String[] args) {

        // сортировать по
        // price, color, brand

        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);
        Comparator<Car> carComparator = new Car.priceComparator().thenComparing(new Car.colorComparator()).thenComparing(new Car.brandComparator());
        TreeSet<Car> carTreeSet = new TreeSet<>(carComparator);

        carTreeSet.add(blackOpel);
        carTreeSet.add(redOpel);
        carTreeSet.add(yellowMazda);
        carTreeSet.add(greenMazda);
        System.out.println(carTreeSet);

    }
}