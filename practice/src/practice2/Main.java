package practice2;

public class Main {

	public static void main(String[] args) {
		// creating the Objects of Geek class. 
				Class g1 = new Class("aa", 1); 
				Class g2 = new Class("aa", 2); 
				
				// comparing above created Objects. 
				if(g1.hashCode() == g2.hashCode()) 
				{ 

					if(g1.equals(g2)) 
						System.out.println("Both Objects are equal. "); 
					else
						System.out.println("Both Objects are not equal. "); 
			
				} 
				else
				System.out.println("Both Objects are not equal. "); 
			} 
	}

