package com.quick.carpool.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.quick.carpool.model.Car;
import com.quick.carpool.services.impl.CarServiceImpl;

@RestController
@RequestMapping("/cars")
public class CarPoolController {
	
	public static final Logger Log  = LoggerFactory.getLogger(CarPoolController.class);
	
	@Value(value="gateway.url")
	private String GATEWAY_URL;

	private static final Logger LOG = LoggerFactory.getLogger(CarPoolController.class);
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CarServiceImpl carService;
	
	@GetMapping("/")
	public List<Car> doGetAll() {
		List<Car> cars  = carService.findAll();
		return cars;
	}
	
	@GetMapping("/{id}")
	public Car doGet(@PathParam(value = "id") Long id) {
		Car car  = carService.findById(id);
		return car;
	}

	@PostMapping("/")
	public Car doPost(@RequestBody Car car) {
		Car savedCar = carService.save(car);
		return savedCar;
	}

	@PutMapping("/{id}")
	public Car doPut(@RequestBody Car car) {
		Car updatedCar = carService.save(car);
		return updatedCar;
	}

	@DeleteMapping("/{id}")
	public void doDelete(@PathParam(value = "id") Long id) {
		carService.deleteById(id);
	}
	
	@GetMapping("/getInvoice/")
	public String getInvoice() {
		
		Log.info(GATEWAY_URL);
		String response = restTemplate.getForObject("http://QuickCarPool-Gateway:9010/api"+ "/QuickCarPool-BillingServices/billing/", String.class);
		return response;
	}
}
