package com.abijij.springboot.app.items.springbootsercieitems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SpringbootSercieItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSercieItemsApplication.class, args);
	}

}
