package com.example.ems;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Optional<Employee> findEmployeeById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
