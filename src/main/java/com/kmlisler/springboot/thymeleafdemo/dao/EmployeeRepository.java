package com.kmlisler.springboot.thymeleafdemo.dao;

import com.kmlisler.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // we get this crud methods with free !!
}
