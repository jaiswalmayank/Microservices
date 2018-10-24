package com.quick.carpool.notification.services;

import java.util.ArrayList;
import java.util.List;

public class BaseService<T ,E extends List<T>> implements BaseInterface<T> {

	private T t;

	private E e;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public boolean isEqual(BaseService<T,E> t1) {
		return this.getT().equals(t1.getT());
	}
	
	@Override
	public boolean compareTo(T t) {
		return false;
	}
	
	public <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
	
	public void printMe() {
		for (T element : this.getE()) {
			System.out.println(element);
		}
	}
	
	public static void main(String args[]) {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("deepika");
		nameList.add("Versha");
		BaseService<String,List<String>> baseService1 = new BaseService<String,List<String>>();
		BaseService<String,List<String>> baseService2 = new BaseService<String,List<String>>();
		baseService1.setT("mayank");
		baseService1.setE(nameList);
		baseService2.setT("mayank");
		baseService2.setE(nameList);
		baseService2.printMe();
		
		
		List<Integer> ageList = new ArrayList<Integer>();
		BaseService<Integer,List<Integer>> baseService3 = new BaseService<Integer,List<Integer>>();
		BaseService<Integer,List<Integer>> baseService4 = new BaseService<Integer,List<Integer>>();
		baseService3.setT(1);
		baseService3.setE(ageList);
		baseService4.setT(2);
		baseService4.setE(ageList);
		System.out.println(baseService1.isEqual(baseService2));
		
		System.out.println(baseService3.isEqual(baseService4));
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
		baseService3.printArray(intArray);
		
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
		baseService3.printArray(charArray);
	}
	
}

