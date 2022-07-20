package com.springbootreactdevkit.repository;

import com.springbootreactdevkit.SpringbootReactDevkitApplication;
import com.springbootreactdevkit.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = SpringbootReactDevkitApplication.class)
public class EmployeeRepositoryTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        employeeRepository.deleteAll();
    }

    @Test
    public void shouldSaveAndGetEmployeeFromRepository() {
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
        Employee employeeFound1 = employeeRepository.findById(employee1.getId()).get();
        assertEquals(employee1.getFirstName(), employeeFound1.getFirstName());
        Employee employeeFound2 = employeeRepository.findById(employee2.getId()).get();
        assertEquals(employee2.getFirstName(), employeeFound2.getFirstName());
    }
}
