package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entities.Articulo;
import com.example.repository.ArticuloRepo;

@SpringBootApplication
@EntityScan("com.example.entities")
@EnableJpaRepositories("com.example.repository")
@ComponentScan("com.example.controllers")
public class DemoInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInventoryApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(ArticuloRepo articuloRepo) {
		return args -> {
			System.out.println("Listening");
		};
	}
}

// https://spring.io/guides/gs/accessing-data-mysql/
// https://spring.io/guides/tutorials/bookmarks/
