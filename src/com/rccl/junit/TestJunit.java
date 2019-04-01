package com.rccl.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.rccl.model.VehicleInt;
import com.rccl.model.Vehicle;

/**
 * 
 */
/**
 * This program Junit testing Vehicle application details
 * 
 * @author Raj
 * @version 1.0
 * @since 03-31-2019
 */

public class TestJunit {
	VehicleInt car = new Car();
	String strCar = new String("moving like a car");

	VehicleInt bike = new Bike();
	String strBike = new String("moving like a bike");

	CarVeh carVeh = new CarVeh();
	BikeVeh bikeVeh = new BikeVeh();

	public enum Type {
		CAR, BIKE
	}

	@Test
	public void testAdd() {
		String str = "Test";
		assertEquals("Test", str);
	}

	@Test
	public void vehicleCarCheck() {
		String str1 = null;
		Type type = Type.CAR;
		if (type == Type.CAR) {
			str1 = car.move();
		}
		assertEquals(strCar, str1);

	}

	@Test
	public void vehicleBikeCheck() {
		String str2 = null;
		Type type = Type.BIKE;
		if (type == Type.BIKE) {
			str2 = bike.move();
		}
		assertEquals(strBike, str2);
	}

	@Test
	public void vehicleCarCheckType() {
		String str1 = null;
		str1 = carVeh.move(Vehicle.Type.CAR);
		assertEquals(strCar, str1);

	}

	@Test
	public void vehicleBikeCheckType() {
		String str2 = null;
		str2 = bikeVeh.move(Vehicle.Type.BIKE);
		assertEquals(strBike, str2);
	}

}
