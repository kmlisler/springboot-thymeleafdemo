package com.kmlisler.springboot.thymeleafdemo.dao;

import com.kmlisler.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // we get this crud methods with free !!

    // get datas order by firstname
    public List<Employee> findAllByOrderByFirstNameAsc();
}
