package com.info.jjd.lesson6.task2;

public class Farm {
    private Farmer farmer;
    private Pets[] pets;

    public Farm(Farmer farmer) {
        this.farmer = farmer;
        pets = new Pets[10];
    }
}
