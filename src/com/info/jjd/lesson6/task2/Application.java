package com.info.jjd.lesson6.task2;

public class Application {
    public static void main(String[] args) {


        Cow cow = new Cow("корова", 10, 15, 5);
        Rabbit rabbit = new Rabbit("кролик", 5, 10, 5);
        Cat cat = new Cat("кот", 10, 15, 6, false);
        Chicken chicken = new Chicken("курица", 10, 1, 8);
        Wolf wolf = new Wolf("Волк",15,5,20);
        Bear bear = new Bear("Мишка",10,5,30);
        Fox fox = new Fox("Лисица",8,4,9);
        Farm farm = new Farm(new Pets[]{cat,chicken,cow,rabbit});
        Farmer farmer = new Farmer();




        bear.attackFarm(farm);















    }
}
