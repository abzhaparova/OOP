        
package lab2;

public class Student {
	  //private String name = new String();
	  private String name;

	  private int id = 0;
	  public int yearOfStudy = 0;
	  
	  public Student(String name, int id){
	    this.name = name;
	    this.id = id;
	  }
	  
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	  
	  public int getId() {
	    return id;
	  }
	  
	  public void incYear() {
	    yearOfStudy ++;
	  }
}


    