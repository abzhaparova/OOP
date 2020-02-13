package lab4;

public class Instructor {
	String firstName;
    String lastName;
    String department;
    String email;

    public Instructor(String firstName, String lastName, String department, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    
    
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    
    
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    

    public String  toString(){
        return "Instructor: " + this.firstName + " " + "\n" +" Department of " + this.department + "\n" + "email: " + this.email;
    }

    public Boolean equals(Instructor instructor){
        if(this.firstName == instructor.firstName && this.lastName == instructor.lastName && this.email == instructor.lastName &&  this.department == instructor.department)
        		return true;
        return false;
    }
}