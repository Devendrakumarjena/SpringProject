package com.dev.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component

public class Bike  implements vehical {
	
	public void Drive() {
		
		System.out.println("Bike class in working Here....");
	}

}
