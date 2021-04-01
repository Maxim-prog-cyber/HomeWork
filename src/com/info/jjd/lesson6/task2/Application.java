package com.info.jjd.lesson6.task2;

public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Cow cow = new Cow("домашнее",10,15,5);
        Rabbit rabbit = new Rabbit("домашнее",5,10,5);
        Cat cat = new Cat("домашнее",10,15,6,false);
        Chicken chicken = new Chicken("домашнее",10,13,8);

        System.out.println(farmer.getResources());


        farmer.pickResources(new Pets[]{cow,rabbit,cat,chicken});
        System.out.println(farmer.getResources());

        farmer.eatPets(new Pets[]{cow,rabbit,cat,chicken});
        farmer.eatPets(new Pets[]{cow,rabbit,cat,chicken});



    }
}
