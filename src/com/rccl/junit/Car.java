package com.rccl.junit;
/**
 * 
 */
/**
 * This program takes the Car vehicle details
 * 
 * @author Raj
 * @version 1.0 
 * @since   03-31-2019
 */

import com.rccl.model.VehicleInt;
import com.rccl.utility.Consts;

class Car implements VehicleInt {
	  /**
	   * @return String This returns moving vehicle details.
	   */
	public String move() {
		return Consts.MOVING +"car";
	}

}
