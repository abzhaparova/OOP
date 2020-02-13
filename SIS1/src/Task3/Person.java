package Task3;

public class Person {
	  Gender gender;
	  
	  public Person() {
	    this.gender = Gender.BOY;
	  }
	  
	  public Person(Gender gender) {
	    this.gender = gender;
	  }
	  
	  
	  public String toString() {
	    return ""+this.gender;
	  }
	}
