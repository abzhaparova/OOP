package problem3;

public class Employee extends Person{

	private double salary;
	private int year;
	private String insuranceNumber;

	public Employee(String name, double salary, int year, String insuranceNumber){
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary(){
		return this.salary;
	}
	public void setSalary(double newsalary){
		this.salary = newsalary;
	}
	public int getYear(){
		return this.year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public String getInsuranceNumber(){
		return this.insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber){
		this.insuranceNumber = insuranceNumber;
	}

	public String toString(){
		return super.toString() + " salary: " + this.salary + " year: " + this.year + " insuranceNumber: " + this.insuranceNumber;
	}

	public boolean equals(String name, double salary, int year, String insuranceNumber){
		if(super.equals(name) && (this.salary == salary) && (this.year == year) && (this.insuranceNumber == insuranceNumber)) return true;
		else return false;
	}
}