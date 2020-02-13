package problem3;
import java.util.*; 


public class Manager extends Employee{
	private String team;
	Vector<Employee> emp = new Vector<Employee>();
	
	public Manager(String name, double salary, int year, String insuranceNumber, String team){
		super(name, salary,  year,  insuranceNumber);
		this.team = team;
	}

	public String getTeam(){
		return this.team;
	}
	public void setTeam(String team){
		this.team = team;
	}

	public void getBonus(double bonus){
		super.setSalary( super.getSalary() + bonus );
	}

	public String toString(){
		return super.toString() + " manager of a team " + team;
	}

	public boolean equals(String name, double salary, int year, String insuranceNumber, String team){
		if(super.equals(name, salary, year, insuranceNumber) && (this.team == team)) return true;
		else return false;
	}
}