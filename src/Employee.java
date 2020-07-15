package src.src;

import java.util.HashMap;
import java.util.Map;

// Multiton example
public class Employee {
    private String name;
    private String role;
    private int employeeId;

    // note the private constructor,
    // only can be called within this class
    private Employee(String name, String role, int employeeId) {
        this.name = name;
        this.role = role;
        this.employeeId = employeeId;
    }

    public String getName() {return name;}
    public String getRole() {return role;}
    public int getId() {return employeeId;}

    // Private static variable storing all of the employees
    private static Map<Integer, Employee> employees = new HashMap<>();

    public static Employee getEmployee(String name, String role, int employeeId) {
       // Checks whether or not an employee exists or not
        if (employees.containsKey(employeeId)) {
            // if employee exists with this id,
            // then just returns it
            return employees.get(employeeId);
        } else {
            // if no employee exists with this id,
            // then create one and return it
            Employee newEmployee = new Employee(name, role, employeeId);
            employees.put(employeeId, newEmployee);
            return newEmployee;
        }
    }
}
