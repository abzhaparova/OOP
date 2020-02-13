package Task2;

import java.util.ArrayList;

import lab2.Student;

public class GradeBookTest {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(new Student("Student A",1));
		students.add(new Student("Student B",2));
		students.add(new Student("Student C",3));
		students.add(new Student("Student D",4));
		students.add(new Student("Student E",5));
		students.add(new Student("Student F",6));
		
		Course course=new Course("OOP",3);
		GradeBook gb=new GradeBook(students,course);
		gb.displayMessage();
		gb.displayGradeReport();	
	}
}

    