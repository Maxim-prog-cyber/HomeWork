package com.info.jjd.lesson6.task2;

import java.util.Arrays;

public class Farmer {
    private int resources;
    private int count;

    public Farmer() {
        this.resources = 5;
    }

    public int getResources() {
        return resources;
    }

    public void pickResources(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getResources() > 0) {
                this.resources = resources + pets[i].getResources();
                pets[i].setResources(0);
                System.out.println(pets[i].getResources());
            }
        }
    }

    public void eatPets(Pets[] pets) {
        for (int j = 0; j < pets.length; j++) {
            if (pets[j].getResources() == 0) count++;
        }

        if (count == pets.length) {
            for (int i = 0; i < pets.length; i++) {
                if (pets[i] == null) continue;
                if (pets[i].isFit()) {
                    System.out.println("Съеден " + pets[i]);
                    pets[i] = null;
                    System.out.println(Arrays.toString(pets));
                    count = 0;
                    return;
                }
            }
        }else {
            System.out.println("На ферме еще есть животные которые дают ресурсы");

        }
    }
}
