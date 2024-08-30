package in.suresh.string.immutable;

import java.util.Date;

public class Employee {

	private final Integer rollNo;
    private final String name;
    private final Date dob;

    public Employee(Integer rollNo, String name, Date dob) {
        this.rollNo = rollNo;
        this.name = name;
        // Creating a new Date object to ensure immutability
        this.dob = new Date(dob.getTime());
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        // Returning a new Date object to ensure immutability
        return new Date(dob.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
