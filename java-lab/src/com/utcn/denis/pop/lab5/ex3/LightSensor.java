package com.utcn.denis.pop.lab5.ex3;

public class LightSensor extends Sensor {

    int readValue() {
        return (int) (Math.random() * 100);
    }
}