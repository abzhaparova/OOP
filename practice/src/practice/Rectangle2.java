package practice;
import java.util.*;

public class Rectangle2 {

	  int length;
	  int breadth;
	  public Rectangle2(int l, int b){
	    length = l;
	    breadth = b;
	  }
	  public int getArea(){
	    return length*breadth;
	  }

	  public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int l,b;

	    System.out.println("Enter length");
	    l = s.nextInt();
	    System.out.println("Enter breadth");
	    b = s.nextInt();

	    Rectangle2 a = new Rectangle2(l,b);
	    System.out.println("Area : "+a.getArea());
	  }
	}	
