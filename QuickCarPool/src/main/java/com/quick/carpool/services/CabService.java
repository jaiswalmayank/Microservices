package com.quick.carpool.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface CabService {

	public static final Logger LOG = LoggerFactory.getLogger(CabService.class);
	
	public default void print() {
		LOG.info("Functional Inteface");
	}
}
