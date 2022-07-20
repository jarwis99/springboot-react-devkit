package com.springbootreactdevkit.repository;

import com.springbootreactdevkit.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
