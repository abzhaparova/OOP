package problem5;

public class Staff extends Person {
		private String school;
		private double pay;
		
		 Staff(){
		        super();
		    }
		    
		 Staff(String name,String address, String school, double pay){
		        super(name,address);
		        this.school = school;
		        this.pay = pay;
		    }

		    public String getSchool(){
		        return this.school;
		    }
		    
		    public void setSchool(String school){
		    	this.school = school;
		    }
		    
		    public double getPay(){
		        return this.pay;
		    }
		    
		    public void setPay(int pay){
		        this.pay = pay;
		    }
		    

			public String toString(){
				return "Student's name is " + super.getName() +"Student's addreess is " + super.getAddress()+"Student's school is" + this.school + "Students's pay is " + this.pay;	
}
}
