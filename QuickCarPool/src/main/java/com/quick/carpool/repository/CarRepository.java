package com.quick.carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quick.carpool.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
