package com.adrian.mssc.beer.inventory.failover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsscBeerInventoryFailoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerInventoryFailoverApplication.class, args);
	}

}
