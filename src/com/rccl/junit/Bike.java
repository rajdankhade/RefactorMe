package com.rccl.junit;

import com.rccl.model.VehicleInt;
import com.rccl.utility.Consts;

/**
 * 
 */
/**
 * This program takes the Bike vehicle details 
 * 
 * @author Raj
 * @version 1.0
 * @since 03-31-2019
 */
class Bike implements VehicleInt {
	/**
	 * 
	 * @return String This returns moving vehicle details.
	 */
	public String move() {
		return Consts.MOVING + "bike";
	}

}
