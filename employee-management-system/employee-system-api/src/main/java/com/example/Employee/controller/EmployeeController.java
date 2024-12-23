package com.example.Employee.controller;

import com.example.Employee.model.Employee;
import com.example.Employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){

        this.employeeService=employeeService;
    }

    @PostMapping(value = "/employees", consumes="application/json", produces="application/json")
    public @ResponseBody Employee createEmployee(@RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }
}
