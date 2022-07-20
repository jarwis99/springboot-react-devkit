package com.springbootreactdevkit;

import com.springbootreactdevkit.entity.Employee;
import com.springbootreactdevkit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootReactDevkitApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootReactDevkitApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("Tony")
                .lastName("Stark")
                .email("tony@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("John")
                .lastName("Cena")
                .email("cena@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
    }

}
