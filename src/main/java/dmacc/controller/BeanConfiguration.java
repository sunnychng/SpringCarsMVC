package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Owner;
import dmacc.beans.Vehicle;

@Configuration
public class BeanConfiguration {
	@Bean
	public Vehicle vehicle() {
		Vehicle bean = new Vehicle("Toyota");
		//bean.setName("Dr. Seuss");
		//bean.setPhone("555-555-5555");
		//bean.setRelationship("friend");
		return bean;
	}
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner("John", "5155552233", "2020");
		return bean;
	}
	
}
