package com.poc.cadastro;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroApplication {
	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
		// Create a Flyway instance
		Flyway flyway = Flyway.configure()
				.dataSource("jdbc:mysql://localhost:3306/cadastro_db", "teste", "teste")
				.locations("classpath:db/migration")
				.load();
		// Execute the migration
		flyway.migrate();
	}
}
