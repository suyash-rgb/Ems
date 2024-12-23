package com.example.Employee.services;

import com.example.Employee.entity.EmployeeEntity;
import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        //logger.debug("Received Employee DTO: firstName={}, lastName={}, emailId={}", employee.getFirstName(), employee.getLastName(), employee.getEmailId());
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        //logger.debug("Employee Entity after copy: firstName={}, lastName={}, emailId={}", employeeEntity.getFirstName(), employeeEntity.getLastName(), employeeEntity.getEmailId());
        employeeRepository.save(employeeEntity);
        return employee;
    }

}
