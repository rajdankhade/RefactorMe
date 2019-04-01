package com.rccl.junit;

import com.rccl.model.Vehicle;
import com.rccl.utility.Consts;

/**
 * 
 */
/**
 * This program takes the Car vehicle details
 * 
 * @author Raj
 * @version 1.0
 * @since 03-31-2019
 */
class CarVeh extends Vehicle {
	/**
	 * This method is used to take type.
	 * 
	 * @param Type This is the first paramter to move method
	 * @return String This returns moving vehicle details.
	 */
	public String move(Type type) {
		if (type == Type.CAR) {
			return Consts.MOVING + "car";
		} else {
			return null;
		}
	}

}
