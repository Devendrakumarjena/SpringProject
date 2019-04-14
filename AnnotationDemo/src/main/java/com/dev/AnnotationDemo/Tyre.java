package com.dev.AnnotationDemo;

public class Tyre {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


//	top print the data
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	

	
	
	
}
