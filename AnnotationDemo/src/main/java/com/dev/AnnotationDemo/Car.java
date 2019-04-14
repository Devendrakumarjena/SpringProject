package com.dev.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehical {
	
	public void Drive() {
		
		System.out.println("Car class is working Here.....");
	}

}
