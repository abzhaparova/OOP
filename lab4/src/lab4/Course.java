package lab4;

public class Course {
	String courseTitle;
    TextBook textBook = new TextBook("2389-8983-893", "Calculus I", "Tomas J.");
    Instructor instructor = new Instructor("Fuad", "Hadjiev", "FIT", "MRFuadOuEEE@gmai.com");
   
    
    public Course(String courseTitle){
        this.courseTitle = courseTitle;
    }

    
    public String getCourseTitle(){
        return this.courseTitle;
    }
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    

    
    public String getTextbookIsbn(){
        return textBook.getIsbn();
    }
    public void setTextbookIsbn(String isbn){
        textBook.setIsbn(isbn);
    }
    
    
    
    public String getTextbookTitle(){
        return textBook.getTitle();
    }
    public void setTextbookTitle(String title){
        textBook.setTitle(title);
    }
    
    
    
    public String getTextbookAuthor(){
        return textBook.getAuthor();
    }
    public void setTextbookAuthor(String author){
        textBook.setAuthor(author);
    }
   
    
    
    public String getInstructorFirstName(){
        return instructor.getFirstName();
    }
    public void setInstructorFirstName(String firstName){
        instructor.setFirstName(firstName);
    }
    
    

    public String getInstructorLastName(){
        return instructor.getLastName();
    } 
    public void setInstructorLastName(String lastName){
        instructor.setLastName(lastName);
    }
  
   
    
    public String getInstructorDepartment(){
        return instructor.getDepartment();
    }
    public void setInstructorDepartment(String department){
        instructor.setDepartment(department);
    }
    
    
    
    public String getInstructorEmail(){
        return instructor.getEmail();
    }
    public void setInstructorEmail(String email){
        instructor.setEmail(email);
    }

    
    public String toString() {
        return this.courseTitle + textBook.toString() + instructor.toString();
    }

    public boolean equals(Course course) {
        if(this.courseTitle == course.courseTitle && this.textBook.equals(course.textBook) && this.instructor.equals(course.instructor)) 
        	return true;
        return  false;
    }
}
