package com.kmlisler.springboot.thymeleafdemo.controller;

import com.kmlisler.springboot.thymeleafdemo.entity.Employee;
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
    private List<Employee> theEmployees;
    @PostConstruct
    private void loadData(){
        Employee emp1 = new Employee(1,"Kamil","İşler","kamilislerr@gmail.com");
        Employee emp2 = new Employee(1,"Samet","Çerezci","smtcrz@gmail.com");
        Employee emp3 = new Employee(1,"Ahmet","İşler","ahmetislerr@gmail.com");
        Employee emp4 = new Employee(1,"Hakan","Demirel","hkndmrl@gmail.com");

        theEmployees = new ArrayList<>();

        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);
        theEmployees.add(emp4);
    }

    // add mapping for list

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        theModel.addAttribute("employes",theEmployees); // oluşturduğumuz verileri html sayfasına attribute olarak gönderdik artık kullanabiliriz.
        return "list-employees";
    }
}
