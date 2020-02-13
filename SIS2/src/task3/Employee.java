package task3;
import java.util.*;

public class Employee extends Person implements Clonable{

		public double salary;
		private Date hireDate;
		private String insuranceNumber;

		public Employee(String name, double salary, Date hireDate, String insuranceNumber){
			super(name);
			this.salary = salary;
			this.hireDate = hireDate;
			this.insuranceNumber = insuranceNumber;
		}
		
		public double getSalary(){
			return this.salary;
		}
		public void setSalary(double salary){
			this.salary = salary;
		}
		public Date getDate(){
			return this.hireDate;
		}
		public void setDate(Date hireDate){
			this.hireDate = hireDate;
		}
		public String getInsuranceNumber(){
			return this.insuranceNumber;
		}
		public void setInsuranceNumber(String insuranceNumber){
			this.insuranceNumber = insuranceNumber;
		}

		public String toString(){
			return super.toString() + " salary: " + this.salary + " date: " + this.hireDate + " insuranceNumber: " + this.insuranceNumber;
		}

		public boolean equals(String name, double salary, Date hireDate, String insuranceNumber){
			if(super.equals(name) && (this.salary == salary) && (this.hireDate.equals(hireDate)) && (this.insuranceNumber == insuranceNumber)) return true;
			else return false;
		}

		public int compareTo(Object o) {
			Employee e = (Employee) o;
			if(salary > e.getSalary()) return 1;
			if(salary < e.getSalary()) return -1;
			
			return 0;
		}

		
		public Employee clone() throws CloneNotSupportedException {
	       		Employee cloned = new Employee(getName(), this.salary, this.hireDate, this.insuranceNumber);
	        	cloned.hireDate = (Date)hireDate.clone();
	        	return cloned;
	    }
}