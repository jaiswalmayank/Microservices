package com.quick.carpool.notification.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class NotificationService<T> extends BaseService<T, List<T>> {
	
	
	public static void main(String args[]) {
		NotificationService<String> notificationService = new NotificationService<String>();
		NotificationService<Object> notificationService1 = new NotificationService<Object>();
		BaseService<String,List<String>> baseService = new BaseService<String,List<String>>();
		
		baseService = notificationService;
		
		List<Integer> number1 = new ArrayList<Integer>();
		number1.add(10);
		number1.add(20);
		System.out.println(sum(number1));
		
		List<Double> number2 = new ArrayList<Double>();
		number2.add(10D);
		number2.add(20D);
		System.out.println(sum(number2));
		
		List<Float> number3 = new ArrayList<Float>();
		number3.add(10.34F);
		number3.add(20.590F);
		System.out.println(sum(number3));
		
		printData(number3);
		
		
	}
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		
		for(Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
		
	}

	public static void printData(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public  void addData(List<? super Integer> list ,T t) {
	}
}
