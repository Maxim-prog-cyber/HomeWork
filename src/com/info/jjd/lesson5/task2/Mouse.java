package com.info.jjd.lesson5.task2;

public class Mouse {
    private int speedMouse;

    public Mouse(int speedMouse) {
        setSpeedMouse(speedMouse);
    }

    public int getSpeedMouse() {
        return speedMouse;
    }

    public void setSpeedMouse(int speedMouse) {
        if (speedMouse <= 0) throw new IllegalArgumentException("speedMouse <= 0");
        this.speedMouse = speedMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}
