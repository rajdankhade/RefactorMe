package com.rccl.model;

public class Vehicle {


    public enum Type {
        CAR,
        BIKE
    }

    private Type type;

    public void move() {
        String moving = "moving like a";
        if (type == Type.CAR) {
            moving += "car";
        }
        if (type == Type.BIKE) {
            moving += "bike";
        }
        System.out.println(moving);
    }

    public Vehicle(Type type) {
        this.type = type;
    }

}
