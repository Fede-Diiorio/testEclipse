package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.helpers.DatabaseLoader;
import com.coderhouse.models.Brand;
import com.coderhouse.models.Company;
import com.coderhouse.models.User;

@SpringBootApplication
public class TestCoderApplication implements CommandLineRunner{

	@Autowired
	private DatabaseLoader dbl;

	public static void main(String[] args) {
		SpringApplication.run(TestCoderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			dbl.LoadAll();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
