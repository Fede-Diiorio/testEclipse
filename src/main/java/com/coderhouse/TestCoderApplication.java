package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Brand;
import com.coderhouse.models.Company;
import com.coderhouse.models.User;

@SpringBootApplication
public class TestCoderApplication implements CommandLineRunner{

	@Autowired
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(TestCoderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			Brand brand1 = new Brand("BLACKBERRY");
			Brand brand2 = new Brand("LG");
			Brand brand3 = new Brand("MOTOROLA");
			Brand brand4 = new Brand("NOKIA");
			Brand brand5 = new Brand("SAMSUNG");
			Brand brand6 = new Brand("SONY");
			
			dao.createBrand(brand1);
			dao.createBrand(brand2);
			dao.createBrand(brand3);
			dao.createBrand(brand4);
			dao.createBrand(brand5);
			dao.createBrand(brand6);
			
			Company company1 = new Company("IUSACELL");
			Company company2 = new Company("TELCEL");
			Company company3 = new Company("MOVISTAR");
			Company company4 = new Company("UNEFON");
			Company company5 = new Company("AXEL");
			Company company6 = new Company("AT&T");
			Company company7 = new Company("NEXTEL");
			
			dao.createCompany(company1);
			dao.createCompany(company2);
			dao.createCompany(company3);
			dao.createCompany(company4);
			dao.createCompany(company5);
			dao.createCompany(company6);
			dao.createCompany(company7);
			
			Brand blackberry = dao.getBrandById(1);
			Brand lg = dao.getBrandById(2);
			Brand motorola = dao.getBrandById(3);
			Brand nokia = dao.getBrandById(4);
			Brand samsung = dao.getBrandById(5);
			Brand sony = dao.getBrandById(6);
			
			Company iusacell = dao.getCompanyById(1);
			Company telcel = dao.getCompanyById(2);
			Company movistar = dao.getCompanyById(3);
			Company unefon = dao.getCompanyById(4);
			Company axel = dao.getCompanyById(5);
			Company atyt = dao.getCompanyById(6);
			Company nextel = dao.getCompanyById(7);
			
			User user1 = new User("BRE2271", "BRENDA", 'F', (byte)2, "brenda@live.com", "6655-330-5736", samsung, iusacell, 100F, true);
			User user2 = new User("OSC4677", "OSCAR", 'M', (byte)3, "oscar@gmail.com", "655-143-4181", lg, telcel, 0F, true);
			User user3 = new User("JOS7086", "JOSE", 'M', (byte)3, "francisco@gmail.com", "655-143-3922", nokia, movistar, 150F, true);
			User user4 = new User("LUI6115", "LUIS", 'M', (byte)0, "enrique@outlook.com", "655-137-1279", samsung, telcel, 50F, true);
			User user5 = new User("LUI7072", "LUIS", 'M', (byte)1, "luis@hotmail.com", "655-100-8260", nokia, iusacell, 50F, false);
			User user6 = new User("DAN2832", "DANIEL", 'M', (byte)0, "daniel@outlook.com", "655-145-2586", sony, unefon, 100F, true);
			User user7 = new User("JAQ5351", "JAQUELINE", 'F', (byte)0, "jaqueline@outlook.com", "655-330-5514", blackberry, axel, 0F, true);
			User user8 = new User("ROM6520", "ROMAN", 'M', (byte)2, "roman@gmail.com", "655-330-3263", lg, iusacell, 50F, true);
			User user9 = new User("BLA9739", "BLAS", 'M', (byte)0, "blas@hotmail.com", "655-330-3871", lg, unefon, 100F, true);
			User user10 = new User("JES4752", "JESSICA", 'F', (byte)1, "jessica@hotmail.com", "655-143-6861", samsung, telcel, 500F, true);
			User user11 = new User("DIA6570", "DIANA", 'F', (byte)1, "diana@live.com", "655-143-3952", sony, unefon, 100F, false);
			User user12 = new User("RIC8283", "RICARDO", 'M', (byte)2, "ricardo@hotmail.com", "655-145-6049", motorola, iusacell, 150F, true);
			User user13 = new User("VAL6882", "VALENTINA", 'F', (byte)0, "valentina@live.com", "655-137-4253", blackberry, atyt, 50F, false);
			User user14 = new User("BRE8106", "BRENDA", 'F', (byte)3, "brenda2@gmail.com", "655-100-1351", motorola, nextel, 150F, true);
			User user15 = new User("LUC4982", "LUCIA", 'F', (byte)3, "lucia@gmail.com", "655-145-4992", blackberry, iusacell, 0F, true);
			User user16 = new User("JUA2337", "JUAN", 'M', (byte)0, "juan@outlook.com", "655-100-6517", samsung, axel, 0F, false);
			User user17 = new User("ELP2984", "ELPIDIO", 'M', (byte)1, "elpidio@outlook.com", "655-145-9938", motorola, movistar, 500F, true);
			User user18 = new User("JES9640", "JESSICA", 'F', (byte)3, "jessica2@live.com", "655-330-5143", sony, iusacell, 200F, true);
			User user19 = new User("LET4015", "LETICIA", 'F', (byte)2, "leticia@yahoo.com", "655-143-4019", blackberry, unefon, 100F, true);
			User user20 = new User("LUI1076", "LUIS", 'M', (byte)3, "luis2@live.com", "655-100-5085", sony, unefon, 150F, true);
			User user21 = new User("HUG5441", "HUGO", 'M', (byte)2, "hugo@live.com", "655-137-3935", motorola, atyt, 500F, true);

			dao.createUser(user1);
			dao.createUser(user2);
			dao.createUser(user3);
			dao.createUser(user4);
			dao.createUser(user5);
			dao.createUser(user6);
			dao.createUser(user7);
			dao.createUser(user8);
			dao.createUser(user9);
			dao.createUser(user10);
			dao.createUser(user11);
			dao.createUser(user12);
			dao.createUser(user13);
			dao.createUser(user14);
			dao.createUser(user15);
			dao.createUser(user16);
			dao.createUser(user17);
			dao.createUser(user18);
			dao.createUser(user19);
			dao.createUser(user20);
			dao.createUser(user21);
			
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
