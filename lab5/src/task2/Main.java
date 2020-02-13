package task2;
import java.util.Date;

public class Main{
	public static void main(String[] args) {
		Employee emp = new Employee("Aida", 5454454.4545,  new Date(), "18BD3832");

		System.out.println(emp.getName());
		emp.setName("Aidan");
		System.out.println(emp.getName());
		System.out.println(emp.toString());
		
		
		System.out.println(emp.toString());
		if(emp.equals("Aidana", 5454454.4545, new Date(), "18BD3832")) 
		System.out.println(emp.toString());
		System.out.println("------------------");

		Manager man = new Manager("Aidanak", 690000.0, new Date(), "18BD20832", "redTeam");
		System.out.println(man.getTeam());
		man.getBonus(30000);
		System.out.println(man.getSalary());
		System.out.println(man.toString());

		Employee emp2 = new Employee("Aidak", 5454454.45445, new Date(), "18BD3832");

		System.out.println(emp.CompareEmployee(emp2));

		Manager man2 = new Manager("Aidanak", 690000.0, new Date(), "18BD20832", "redTeam");
		man2.getBonus(30000);

		System.out.println(man2.CompareManager(man));
	}
}