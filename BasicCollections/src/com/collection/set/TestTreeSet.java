package com.collection.set;


import java.util.TreeSet;

import com.collection.list.Car;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Car> car=new TreeSet<>();
		
		car.add(new Car("Toyota", "Etios", 20010, 230000));
		car.add(new Car("BMW", "4567", 2014, 470000));
		car.add(new Car("Audi", "8", 2017, 2023000));
		
		car.stream().forEach((name) -> System.out.println(name));
		
	}

}
