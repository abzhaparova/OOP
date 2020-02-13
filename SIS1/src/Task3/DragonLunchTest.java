package Task3;

public class DragonLunchTest {

	  public static void main(String[] args) {
	    DragonLunch today = new DragonLunch();
	    Person g1 = new Person(Gender.GIRL);
	    Person b1 = new Person();
	    Person g2 = new Person(Gender.GIRL);
	    Person b2 = new Person();
	    
	    today.kindnap(b1);
	    today.kindnap(b2);
	    today.kindnap(g1);
	    today.kindnap(g2);
	    
	    System.out.println(today.willDragonEatOrNot());
	    
	    today.kindnap(g1);
	    today.kindnap(b1);
	    today.kindnap(g2);
	    today.kindnap(b2);
	    
	    System.out.println(today.willDragonEatOrNot());
	    
	    today.kindnap(g1);
	    today.kindnap(g1);
	    today.kindnap(g2);
	    today.kindnap(b2);
	    
	    System.out.println(today.willDragonEatOrNot());
	    
	    today.kindnap(b1);
	    today.kindnap(g1);
	    today.kindnap(g2);
	    today.kindnap(b2);
	    
	    System.out.println(today.willDragonEatOrNot());
	  }
	}