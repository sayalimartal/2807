package com.collection.list;

import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Object> list=new LinkedList<>();
		
		list.add(new Laptop("Dell","Inspiron 3500","Windows","Intel i5"));
		list.add(new Laptop("MacBook","Air Pro","MacOs","Intel i7"));
		list.add(new Laptop("HP","Edge","Windows","Intel i7"));
		
		list.add(new Car("Toyota", "Etios", 20010, 230000));
		list.add(new Car("BMW", "4567", 2014, 470000));
		list.add(new Car("Audi", "8", 2017, 2023000));
		
		list.add(new CellPhone("Moto", "G5S Plus", "Black", "Android", 14000));
		list.add(new CellPhone("OnePlus", "5T", "Black", "Android", 30000));
		list.add(new CellPhone("Apple", "X", "Rose Gold", "iOS", 70000));
		
		list.add(new Television("Videocon", "LCD", false, 40000));
		list.add(new Television("Onida", "LED", true, 53000));
		list.add(new Television("Sony", "Plasma", true, 125000));
		
		list.add(new School("V.P.M", "Mumbai", "Mumbai", 50));
		list.add(new School("SFIT", "Mumbai", "Mumbai", 35));
		list.add(new School("S.V.P", "Thane", "Thane", 2));
		
		list.stream().forEach((linkedList) -> System.out.println(linkedList));

	}
}
