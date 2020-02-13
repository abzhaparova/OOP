package lab2;
import java.util.Scanner;

public class Data {
	    private double sum=0;
	    private double max=0;
	    private int count=0;
	    
public Data() {}
	    
public void Add(int newData){
	    if(count == 0)
	    max = newData;

	    max = Math.max(max, newData);
	    sum += newData;
	    count++;
	    }

public double Average(){
	   if(count == 0)
	   return 0;
	   
	   return sum/count;
	   }

public double Maximum(){
       return max;
	   }

public static void main(String [] args){
	   Scanner sc = new Scanner(System.in);
	   Data data = new Data();
	   String s = new String();
	   
	   while(true){
		   System.out.println("Enter number (Q to quit): ");
		   s = sc.next();
		   if(s.equals("Q"))
		   {
			   break;
			   }
		   data.Add(Integer.parseInt(s));
		   }
	   
	   System.out.println("Average: " + data.Average());
	   System.out.println("Maximum: " + data.Maximum());
	   sc.close();
	   }
}