package com.bridgelabz.crud;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MySqlCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlCrudApplication.class, args);
	}

}
