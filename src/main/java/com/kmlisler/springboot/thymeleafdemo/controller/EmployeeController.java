package com.kmlisler.springboot.thymeleafdemo.controller;

import com.kmlisler.springboot.thymeleafdemo.entity.Employee;
import com.kmlisler.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    // load employee data
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    // add mapping for list

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        // get employees from db
        List<Employee> theEmployees = employeeService.findAll();

        theModel.addAttribute("employes",theEmployees); // oluşturduğumuz verileri html sayfasına attribute olarak gönderdik artık kullanabiliriz.
        return "list-employees";
    }
}
