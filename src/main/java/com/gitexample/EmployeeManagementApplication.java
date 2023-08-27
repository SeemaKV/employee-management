package com.gitexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		
		List<String> names = new ArrayList<>();
		names.add("Seema");
		names.add("Uma");
		names.add("pooja");
		names.add("Bhumika");
		names.add("Dhruthi");

		for (String name: names)
		{
			System.out.println(name);
		}
	}

}
