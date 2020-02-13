package problem1;

public class Dog extends Animal {
public String name;

public Dog(int size, String color, String name) {
	super(size, color);
	this.name = name;
}

public Dog(String name){
	super();
	this.name = name;
}

public String getName(){
	return this.name;
}

public void name() {
	System.out.println(this.name);
}

public int  body(int legs, int eyes, int nose, int tail){
	return legs + eyes + nose + tail;
}

public int  body(int teeth, int mouth, int fingers){
		return teeth + mouth + fingers ;
	}
}