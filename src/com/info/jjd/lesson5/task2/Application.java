package com.info.jjd.lesson5.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(2);
        Mouse mouse1 = new Mouse(2);
        Mouse mouse2 = new Mouse(4);

        Cat barsik = new Cat("Барсик", "black", 3, 5, 3);
        Cat murzik = new Cat("Мурзик", "white", 8, 3, 2);

        murzik.catchMousses(mouse1);
        murzik.catchMousses(mouse2);
        barsik.catchMousses(mouse);

        System.out.println(murzik);
        System.out.println(barsik);

        barsik.attackCat(murzik);

        System.out.println(murzik);
        System.out.println(barsik);


    }
}
