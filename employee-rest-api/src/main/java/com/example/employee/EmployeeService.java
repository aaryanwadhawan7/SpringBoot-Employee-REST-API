package com.example.employee;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private Map<Long, Employee> employeeRepo = new HashMap<>();

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeRepo.values());
    }

    public Employee addEmployee(Employee e) {
        employeeRepo.put(e.getId(), e);
        return e;
    }

    public void deleteEmployee(Long id) {
        employeeRepo.remove(id);
    }
}
