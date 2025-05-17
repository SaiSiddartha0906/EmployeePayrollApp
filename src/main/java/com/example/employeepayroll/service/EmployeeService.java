package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDTO;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employeepayroll.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee addEmployee(EmployeeDTO dto) {
        Employee emp = new Employee(null, dto.getName(), dto.getGender(), dto.getDepartment(),
                dto.getSalary(), dto.getStartDate());
        return repo.save(emp);
    }

    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        Employee emp = getEmployeeById(id);
        emp.setName(dto.getName());
        emp.setGender(dto.getGender());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        emp.setStartDate(dto.getStartDate());
        return repo.save(emp);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
