package in.suresh.string.immutable;

import java.util.Date;

public class TestImmutable {

	public static void main(String[] args) {
        // Create a date
        Date dateOfBirth = new Date();

        // Create an instance of Employee
        Employee employee = new Employee(1, "John Doe", dateOfBirth);

        // Print the initial state of the employee
        System.out.println("Initial Employee: " + employee);

        // Attempt to modify the name through a new string reference
        String newName = "Suresh";
        String employeeName = employee.getName();
        employeeName = newName; // This won't affect the Employee's name as strings are immutable

        // Print the state of the employee after attempting to modify the name
        System.out.println("Employee after modifying name reference: " + employee);

        // Attempt to modify the name through some other means (not possible directly as Employee is immutable)
        // For illustration: trying to demonstrate immutability - this step is not actually modifiable.

        // Since the Employee class is immutable, there's no direct way to change the name.

        System.out.println("employeeName"+ employeeName);
        // Final state should be unchanged
        System.out.println("Final Employee: " + employee);
    }
}
