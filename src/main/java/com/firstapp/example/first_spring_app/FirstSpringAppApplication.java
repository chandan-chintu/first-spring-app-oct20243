package com.firstapp.example.first_spring_app;

import com.firstapp.example.first_spring_app.model.Address;
import com.firstapp.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello everyone, welcome to first spring app");

// the below code is for tight coupling
//		Employee emp1 = new Employee();
//		emp1.empId = 123;
//		emp1.empName = "Ajay";
//		emp1.email ="ajay123@gmail.com";
//
//		Address address1 = new Address();
//		address1.doorNo=999;
//		address1.streetName="hsuiwka";
//		address1.city="ahsuiwjsn";
//
//		emp1.address = address1;
//
//		address1.doorNo=888;
//		address1.streetName="jiooa";
//
//		emp1.address = address1;

	Employee employee1 = new Employee();
	employee1.setEmpId(123);
	employee1.setEmpName("haji");
	employee1.setEmail("haji@gmail.com");

	Address address1 = new Address();
	address1.setDoorNo(123);
	address1.setStreetName("fhdjurie");
	address1.setCity("snj");

	employee1.setAddress(address1);


	employee1.getAddress().setDoorNo(345);
	employee1.getAddress().setCity("fdniui");
	}

}
