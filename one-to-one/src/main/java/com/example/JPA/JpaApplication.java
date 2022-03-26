package com.example.JPA;

import com.example.JPA.modelDAO.Class1;
import com.example.JPA.modelDAO.Class2;
import com.example.JPA.repo.Repo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Autowired
	Repo1 repo1;

	@Override
	public void run(String... args) throws Exception {
		Class1 class1 = new Class1();
		class1.setName_class1("test");

		Class2 class2 = new Class2();
		class2.setText("am 1 commets");

		class1.setClass2(class2);
		repo1.save(class1);
		System.out.println(repo1.findById(1));

	}
}
