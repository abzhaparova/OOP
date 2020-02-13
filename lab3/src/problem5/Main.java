package problem5;

import java.util.*; 


public class Main {

	public static void main(String[] args) {
			Vector<Person> person = new Vector<Person>();
			
		    Scanner myObj1 = new Scanner(System.in); 
		    System.out.println("Enter name");
		    
		    String name = myObj1.nextLine();  
		    
		    Scanner myObj = new Scanner(System.in); 
		    System.out.println("Enter address");

		    String address = myObj.nextLine();  
		    System.out.println("Student's name and address are: " + name + " " + address);  
		    
		  	Student student = new Student("Aida","Kramskogo 14","Bachelor degree", 2018, 1000.0);
	        Staff staff = new Staff("Zhan","Leila","NIS",1000.01);
	        
	        Person person1 = student;
	        Person person2 = staff;
	        person.add(student);
	        
	        System.out.println(person1.getName()+" "+ person1.getAddress());
	        System.out.println(person2.getName()+" "+ person2.getAddress());
	        	      
	    }
	}