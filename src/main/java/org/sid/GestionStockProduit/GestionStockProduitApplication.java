package org.sid.GestionStockProduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GestionStockProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionStockProduitApplication.class, args);
	}

}
