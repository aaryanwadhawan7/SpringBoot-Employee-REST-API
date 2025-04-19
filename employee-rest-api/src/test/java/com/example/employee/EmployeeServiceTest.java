package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    @Test
    public void testAddEmployee() {
        EmployeeService service = new EmployeeService();
        Employee e = new Employee(1L, "Alice", "HR", 50000);
        Employee saved = service.addEmployee(e);
        assertEquals("Alice", saved.getName());
    }
}
