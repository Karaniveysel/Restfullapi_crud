package com.CRUD;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CrudDbRestfulApplication {

	static Logger log = Logger.getLogger(CrudDbRestfulApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(CrudDbRestfulApplication.class, args);
	}

}
