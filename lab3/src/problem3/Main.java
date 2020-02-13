package problem3;

public class Main {

	public static void main(String[] args) {
		 Employee employee = new Employee("Aida", 100000000.0, 2023, "18BD110266");
	
		 System.out.println(employee.getName());
		 employee.setName("Sunshine");
		 System.out.println(employee.getName());
		 System.out.println(employee.toString());

		 System.out.println(employee.toString());
		 //if(employee.equals("Aida", 100000000.0, 2023, "18BD110266")) System.out.println(employee.toString());
		 if(employee.equals("Diamond", 100000000.0, 2023, "18BD110266")) 
			 System.out.println(employee.toString());

		 System.out.println("------------------");

		 Manager manager = new Manager("Andrea", 690000.0, 1995, "15BD200832", "redTeam");
		 System.out.println(manager.getTeam());
		 manager.getBonus(30000);
		 System.out.println(manager.getSalary());
		 System.out.println(manager.toString());
	}
}