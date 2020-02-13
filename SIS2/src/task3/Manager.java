package task3;
import java.util.*;

public class Manager extends Employee implements Cloneable{

		private String team;
		private double bonus;
		private Vector <Employee> employees = new Vector<Employee>();

		public Manager(String name, double salary, Date hireDate, String insuranceNumber, String team, Vector<Employee> employees){
			super(name, salary,  hireDate,  insuranceNumber);	
			this.team = team;
			this.employees=employees;
		}

		public String getTeam(){
			return this.team;
		}
		
		public void setTeam(String team){
			this.team = team;
		}

		public void setBonus(double bonus){
			super.setSalary(super.getSalary() + bonus );
			this.bonus = bonus;
		}
		
		public double getBonus(){
			return this.bonus;		}
		
		public Vector<Employee> getEmployees() {
			return employees;
		}

		public void addEmployee(Employee e) {
			employees.add(e);
		}

		public String toString(){
			return super.toString() + " manager of a team " + team;
		}

		public boolean equals(String name, double salary, Date hireDate, String insuranceNumber, String team){
			if(super.equals(name, salary, hireDate, insuranceNumber) && (this.team == team)) return true;
			else return false;
		}

		public int CompareManager(Manager m){
			if(this.salary > m.salary) return 1;
			else if(this.salary < m.salary) return 2;
			else{
				if(this.bonus > m.bonus) return 1;
				else if(this.bonus < m.bonus) return 2;
				else return 0;
			}
		}
		
		public int compareTo(Object o) {
			Manager m = (Manager) o;
			if(this.bonus > m.getBonus()) return 1;
			if(this.bonus < m.getBonus()) return -1;
			return 0;
		}

		public Manager clone() throws CloneNotSupportedException {
			Manager cloned = (Manager)super.clone();
			cloned.employees = ( Vector<Employee> )employees.clone();
			return cloned;
		}
}