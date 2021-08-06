package com.opolo.dsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opolo.dsa.service.DsaService;

@SpringBootApplication
public class DsaApplication implements CommandLineRunner	{

	@Autowired
	private DsaService dsaServ;

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dsaServ.testPrograms();
		
	}

}
