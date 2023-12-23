package com.example.inventoryservice;

import com.example.inventoryservice.entites.Product;
import com.example.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			Random random=new Random();
			for (int i = 0; i <10 ; i++) {

				productRepository.saveAll(List.of(
						Product.builder()
								.name("Computer"+i)
								.price(1200+Math.random()*100)
								.quantity(1+random.nextInt(200)).build()
				));
				productRepository.findAll().forEach(System.out::println);

			}



		};

	}
}
