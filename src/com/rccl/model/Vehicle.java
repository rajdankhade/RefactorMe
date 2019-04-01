package com.rccl.model;

/**
 * 
 */
/**
 * This program has declaration the vehicle details
 * 
 * @author Raj
 * @version 1.0
 * @since 03-31-2019
 */
public class Vehicle {

	public enum Type {
		CAR, BIKE
	}

	public String move(Type type) {
		if (type == Type.CAR) {
			System.out.println("moving like a car");
		}

		if (type == Type.BIKE) {
			System.out.println("moving like a bike");
		}
		return "move";
	}

}
