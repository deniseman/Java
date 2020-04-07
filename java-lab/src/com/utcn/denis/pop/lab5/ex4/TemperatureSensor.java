package com.utcn.denis.pop.lab5.ex4;

public class TemperatureSensor extends Sensor {
    @Override
    int readValue() {
        return (int) (Math.random() * 100);
    }
}