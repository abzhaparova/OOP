package Task2;

public class Course {
  private String courseName;
  private String description;
  private int numberOfCredits;
  private String prerequisite;
 
  public Course(String courseName,int numberOfCredits) {
	  this.courseName=courseName;
	  this.numberOfCredits=numberOfCredits;
  }
  
  public String getCourseName() {
	  return courseName;
  }
  public String getDescription() {
	  return description;
  }
  public int getCredits() {
	  return numberOfCredits;
  } 
  public String getPrerequisite() {
	  return prerequisite;
  }
}
 

    