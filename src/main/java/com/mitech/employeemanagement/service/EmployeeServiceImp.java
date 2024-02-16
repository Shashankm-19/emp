package com.mitech.employeemanagement.service;

import com.mitech.employeemanagement.entity.Employee;
import com.mitech.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements  EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);

    }
}
