package problem1;

public class Main {

	public static void main(String[] args) {
	Dog doggy = new Dog(89, "black", "Choppi");
	
	System.out.println(doggy.getName());
	System.out.println(doggy.body(4, 2, 1, 1));
	System.out.println(doggy.body(24, 1, 20));

}
}