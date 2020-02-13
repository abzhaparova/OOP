package practice2;

public class Dog extends Animal{

	private String name;
	private String color;
	private int size;
	
	public Dog() {
		super();
	}
	
	public Dog(String color, int size, String name) {
		super(color, size);
		this.name=name;
	}
	
	
	public String getName() {
	return this.name;
	}
	
	public void name() {
		System.out.println(this.name);

	}
	
}
