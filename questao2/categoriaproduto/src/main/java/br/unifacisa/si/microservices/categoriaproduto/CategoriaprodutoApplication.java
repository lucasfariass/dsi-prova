package br.unifacisa.si.microservices.categoriaproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CategoriaprodutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaprodutoApplication.class, args);
	}

}
