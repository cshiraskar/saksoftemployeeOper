package com.employee.CrudEmployeeOper.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.CrudEmployeeOper.Repository.EmployeeRepository;
import com.employee.CrudEmployeeOper.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee updatedEmployee = employeeRepository.findById(id).orElse(null);
        updatedEmployee.setFirstName(employee.getFirstName());
        updatedEmployee.setLastName(employee.getLastName());
        updatedEmployee.setEmail(employee.getEmail());
        updatedEmployee.setAge(employee.getAge());
        return employeeRepository.save(updatedEmployee);
    }

    public void deleteById(int id) {
    	employeeRepository.deleteById(id);
    }

}