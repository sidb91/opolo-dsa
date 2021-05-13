package com.opolo.dsa.coltdsaudemycourse;

import com.opolo.dsa.coltdsaudemycourse.service.DsaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColtDsaUdemyCourseApplication implements CommandLineRunner	{

	@Autowired
	private DsaService dsaServ;

	public static void main(String[] args) {
		SpringApplication.run(ColtDsaUdemyCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dsaServ.testPrograms();
		
	}

}
