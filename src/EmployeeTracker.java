package src.src;

import java.util.ArrayList;
import java.util.List;

// Singleton Example
public class EmployeeTracker {
    private final List<Employee> employees;

    // note the private constructor,
    // only can be called in this class
    private EmployeeTracker() {
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    private static EmployeeTracker employeeTracker;

    public static EmployeeTracker getEmployeeTracker() {
        if (employeeTracker == null) {
            // Currently no EmployeeTracker exists,
            // so we create one here
            employeeTracker = new EmployeeTracker();
        }
        // If EmployeeTracker is not null, aka it already exists,
        // we simply return the current EmployeeTracker
        return employeeTracker;
    }
}

