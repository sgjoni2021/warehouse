package com.bestoffer.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}


	Product product =
			new Product("Molle e kuqe","Molle",120.0,2023,
					"full","Markata");


}
