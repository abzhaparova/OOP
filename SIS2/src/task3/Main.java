package task3;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Aida", 5454454.4545,  new Date(), "18BD3832");
		Employee emp2 = new Employee("Aidak", 5454454.45445, new Date(), "18BD3832");
		Employee emp3 = new Employee("Aidanak", 5454454.45445, new Date(), "18BD3832");

		Vector<Employee> employees = new Vector<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		Collections.sort(employees, new sortByHireDate());
		System.out.print(employees);
		
		Collections.sort(employees, new sortByName());
		System.out.print(employees);
	}
}

