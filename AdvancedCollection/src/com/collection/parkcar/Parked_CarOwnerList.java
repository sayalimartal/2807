package com.collection.parkcar;

import java.util.TreeSet;


public class Parked_CarOwnerList {
	
	int floor=1;
	int section=1;
	//int count=0;
	int token=1;
	
	public TreeSet<Parked_CarOwner_Details> parkedCars=new TreeSet<>();
	int flag=0;
	
	public void add_new_car(Parked_CarOwner_Details carToPark)
	{
		parkedCars.add(carToPark);
		carToPark.setToken(token);
		token++;
		if(token>20)
		{
			section++;
			if(section>4)
				floor++;
		}
	}
	
	public void remove_car(Parked_CarOwner_Details parkedCar)
	{
		parkedCars.remove(parkedCar);
	}
	
	public void get_parked_car_location(int token)
	{
		System.out.println("This parked car is at floor "+floor+" section "+section);
	}
	
}
