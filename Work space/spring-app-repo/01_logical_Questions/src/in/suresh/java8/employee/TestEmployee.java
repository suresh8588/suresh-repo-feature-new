package in.suresh.java8.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {
		
List<Employee> empList = new ArrayList<Employee>();
        
		empList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		empList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		empList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		empList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		//1. How many male and female employees are there in the organization ?
		
		Map<String,Long> map = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("How many male and female employees are there in the organization : \n"+map);
		
		//2. Print the name of all departments in the organization ?
		Set<String> set = empList.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
		System.out.println("Names of all departments in the organization : \n"+set);
		
		//3. What is the average age of male and female employees ?
		Map<String,Double> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of male and female employees : \n"+map2);
		
		//4. Get the details of highest paid employee in the organization ?
		Employee employee = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Highest paid employee : \n"+employee);
		
		//5. Get the names of all employees who have joined after 2015 ?
		List<String> list = empList.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).collect(Collectors.toList());
		System.out.println("names of all employees who have joined after 2015 : \n"+list);
		
		//6. Count the number of employees in each department ?
		Map<String,Long> map3 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count the number of employees in each department : \n"+map3);
		
		//7. What is the average salary of each department ?
		Map<String,Double> map4 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average salary of each department : \n"+map4);
		
		//8. Get the details of youngest male employee in the Development department ?
		Optional<Employee> youngestEmp = empList.stream().filter(e->e.getDepartment().equals("Development") && e.getGender().equals("Male")).min(Comparator.comparing(Employee::getAge));
		System.out.println("Youngest male employee in the Development department : \n"+youngestEmp);
		
		//9. Who has the most working experience in the organization ?
		Optional<Employee> mostExp = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
		System.out.println("Most working experience in the organization : "+mostExp);
		
		//10. How many male and female employees are there in the Sales team ?
		Map<String,Long> map5 = empList.stream().filter(e->e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Male and female employees are there in the Sales team :\n"+map5);
	}
}
