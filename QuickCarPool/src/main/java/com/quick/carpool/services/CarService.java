package com.quick.carpool.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface CarService {
	
	public static final Logger LOG = LoggerFactory.getLogger(CarService.class);
	
	public default boolean isNull() {
		LOG.info("CarService Interface isNull method called");
		return true;	
	}
	
	public static void print() {
		LOG.info("CarService Inteface print method call");
	}

}
