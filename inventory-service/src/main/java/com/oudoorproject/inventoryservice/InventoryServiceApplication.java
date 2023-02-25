package com.oudoorproject.inventoryservice;

import com.oudoorproject.inventoryservice.model.Inventory;
import com.oudoorproject.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inv1 = Inventory.builder()
					.skuCode("iphone_13")
					.quantity(100)
					.build();
			Inventory inv2 = Inventory.builder()
					.skuCode("iphone_13_red")
					.quantity(0)
					.build();
			inventoryRepository.save(inv1);
			inventoryRepository.save(inv2);
		};
	}
}
