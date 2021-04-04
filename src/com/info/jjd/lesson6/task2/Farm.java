package com.info.jjd.lesson6.task2;

import java.util.Arrays;
import java.util.Random;

public class Farm {
    private Farmer farmer;
    private Pets[] pets;

    public Farmer getFarmer() {
        return farmer;
    }

    public Farm(Pets[] pets) {
        this.pets = pets;
        this.pets = new Pets[10];
    }

    public void addOnFarm(Pets[] pets) {
        System.out.println(Arrays.toString(this.pets));
        int index = 0;
        for (int i = 0; i < pets.length; i++) {
            if (this.pets[i] == null) {
                this.pets[i] = pets[index];
                index++;
            }
        }
        System.out.println(Arrays.toString(this.pets));
        System.out.println();
    }

    public void passDay(Farmer farmer, WildAnimal[] wildAnimals) {
        System.out.println("массив диких животных " + Arrays.toString(wildAnimals));

        farmer.setResources(farmer.getResources() - 2);

        WildAnimal wildAnimal1 = wildAnimals[(int) (Math.random() * wildAnimals.length)];
        System.out.println("рандомное дикое животное: " + wildAnimal1);//test

        int count = 0;

        for (int i = 0; i < this.pets.length; i++) {
            if (pets[i] != null) count++;
        }
        Pets[] pets2 = new Pets[count];
        for (int j = 0; j < pets2.length; j++) {
            if (pets2[j] == null) {
                pets2[j] = this.pets[j];
            }
        }
        System.out.println(" уменьшенный массив домашних животных" + Arrays.toString(pets2));//здесь находится актуальный массив


        Pets petsRandom = this.pets[(int) (Math.random() * pets2.length)];
        System.out.println("рандомное домашнее животное животное: " + petsRandom);

        if (wildAnimal1.getSpeed() > petsRandom.getSpeed()) {
            petsRandom.setOnFarm(false);
            System.out.println("Дикое животное" + wildAnimal1 + " съело домашнее животное " + petsRandom);
        } else System.out.println(wildAnimal1 + "  Уходит ни с чем");


        Random random = new Random();
        int randomValue = random.nextInt(5);
        switch (randomValue) {
            case 0:
            case 2:
                farmer.driveAwayWildAnimal(wildAnimal1);
                break;
            case 1:
            case 4:
            case 3:
                System.out.println();
                break;
        }
        farmer.feedAnimals(pets2);

        farmer.pickResources(pets2);

        farmer.eatPets(pets2);
    }
}
