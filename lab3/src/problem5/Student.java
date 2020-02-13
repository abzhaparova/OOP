package problem5;

public class Student extends Person{
	private String program;
	private int year;
    private double fee;
    
    Student(){
        super();
    }
    
    Student(String name,String address, String program, int year,double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }
    
    public void setProgram(String program){
    	this.program = program;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public double getFee(){
        return this.fee;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }

	public String toString(){
		return "Student's name is " + super.getName() +"Student's addreess is " + super.getAddress()+"Student's program is " + this.program + "Students's year is " + this.year +"Student's fee is "+ this.fee;
	}
}