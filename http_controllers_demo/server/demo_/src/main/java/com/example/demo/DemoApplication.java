package com.example.demo;

import com.example.demo.domain.House;
import com.example.demo.repo.HouseList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			HouseList.setHouses(new House("h1", 1));
			HouseList.setHouses(new House("h2", 2));
			HouseList.setHouses(new House("h3", 3));
			System.out.println(HouseList.getHouses());
		};
	}
}
