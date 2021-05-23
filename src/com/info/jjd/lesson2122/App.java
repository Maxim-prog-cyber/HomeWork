package com.info.jjd.lesson2122;

public class App {
    public static void main(String[] args) {
        Subscriber s1 = Subscriber.GREEN;
        Subscriber s2 = Subscriber.YELLOW;
        Subscriber s3 = Subscriber.RED;
        Sensor sensor = new Sensor();
        sensor.addSubscriber(s1);
        sensor.addSubscriber(s2);
        sensor.addSubscriber(s3);
        sensor.changeTemperatures();
        sensor.changeTemperatures();







    }
}
