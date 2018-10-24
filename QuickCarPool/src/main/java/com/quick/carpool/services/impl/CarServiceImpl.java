package com.quick.carpool.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.carpool.model.Car;
import com.quick.carpool.repository.CarRepository;
import com.quick.carpool.services.CabService;
import com.quick.carpool.services.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;

	public Car findById(Long Id) {
		return carRepository.findById(Id).get();
	}

	public List<Car> findAll() {
		return carRepository.findAll();
	}

	public Car save(Car car) {
		return carRepository.save(car);
	}

	public void deleteById(Long id) {
		carRepository.deleteById(id);

	}

	public static void print() {
		LOG.info("CarServiceImpl class print method call");
	}
	
	public static void main(String args[]) {
		new CarServiceImpl().print();
		new CarServiceImpl().isNull();
	}
}
