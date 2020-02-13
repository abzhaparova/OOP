package Task2;
import java.util.Scanner;
import java.util.ArrayList;
import lab2.Student;;

public class GradeBook {
	private ArrayList<Integer> grades=new ArrayList<Integer>();
	private ArrayList<Student> students=new ArrayList<Student>();
    Course course;
    int a[]=new int[11];
	
	public GradeBook(ArrayList<Student> students,Course course) {
		this.students=students;
		this.course=course;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for "+course.getCourseName()+"!" );
	}
	
	public void displayGradeReport() {
		System.out.println("Please, input grades for students: ");
		inputGrades();
		System.out.println("Class average is "+classAverage()+".  Lowest grade is " + lowestGrade()+"("+students.get(k).getName()+" ,id:"+students.get(k).getId()+")");
		System.out.println("Highest grade is "+ bestGrade()+"("+students.get(p).getName()+" ,id:"+students.get(p).getId()+")");
		outputBarChart();
	}
	
	Scanner sc=new Scanner(System.in);	
	public void inputGrades() {
		int b;
		for(int i=0;i<students.size();i++) {
			System.out.print(students.get(i).getName()+": ");
			b=sc.nextInt();
			grades.add(b);
			a[b/10]++;
		}
	sc.close();
	}
	
	
	public double classAverage() {
		double total=0;
		for(int i=0;i<grades.size();i++) {
			total+=grades.get(i);
		}
		return total/grades.size();
	} 
	
	
	int k;
	public int lowestGrade() {
   	int min=grades.get(0);
 
   	for(int i=1;i<grades.size();++i) {
   		if(min>grades.get(i))
   			{min=grades.get(i);
   		   k=i;}
   		}
   	return min;
    }
	
	
	int p;
	public int bestGrade() {
		int max=grades.get(0);
	   	for(int i=0;i<grades.size();++i) {
	   		if(max<grades.get(i))
	   			{max=grades.get(i);
	   			p=i;
	   			}
	   	}
	   	return max;
	}
	
	
	public void outputBarChart() {
		System.out.println("Grades distribution: ");
		for(int i = 0; i <= 100; i += 10) {
			if(i < 100)
				System.out.print(i + " - " + (i + 9) + ": ");
			else
				System.out.print(i + ": ");
			for(int j = 0; j < a[i / 10]; ++j) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}