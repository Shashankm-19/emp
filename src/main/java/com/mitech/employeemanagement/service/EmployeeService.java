package com.mitech.employeemanagement.service;

import com.mitech.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(int id);
    public Employee save(Employee employee);
    public Employee update(Employee employee);
    public  void delete(int id);

}
