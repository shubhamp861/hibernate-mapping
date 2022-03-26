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
		Class2 class3 = new Class2();
		class3.setText("am 2 commets");

		class1.getClass2List().add(class2);
		class1.getClass2List().add(class3);

		class2.getClass1().add(class1);
		class3.getClass1().add(class1);

		//Integer id = repo1.save(class1).getId();
		System.out.println(repo1.findById(1).get().getClass2List().toString());

	}
}
