package com.add.escolaadd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.add.escolaadd.repository"})
@EnableTransactionManagement
public class EscolaAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaAddApplication.class, args);
	}

}
