package com.info.jjd.lesson2122;

 enum Subscriber implements Alarm {
     GREEN(100),YELLOW(300),RED(600);

     private final int trevoga;



     Subscriber(int trevoga) {
         this.trevoga = trevoga;
     }

     public int getTrevoga() {
         return trevoga;
     }

     @Override
     public void tempChanged(int temp) {
         if (temp == GREEN.getTrevoga()) System.out.println("Green");
         if (temp == YELLOW.getTrevoga()) System.out.println("Green,Yellow");
         if (temp == RED.getTrevoga()) System.out.println("Green,Yellow,Red");

     }
 }
