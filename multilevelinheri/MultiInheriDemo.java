package com.tnsif.multilevelinheri;

public class MultiInheriDemo {

	public static void main(String[] args) {
		
		City city =new City();
		
		
		city.setCityName("Mumbai");
		city.setArea("603.4 km^2");
		
		city.setStateName("Maharashtra");
		city.setLanguage("Marathi");
		
		city.setCapital("New Delhi");
		city.setCountryName("India");
		
		//System.out.println(city.getArea());
		
		System.out.println(city);
		
		
	
	
	}

}
