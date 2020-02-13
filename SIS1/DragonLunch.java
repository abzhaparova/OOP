package Task3;

import java.util.Stack;
import java.util.Vector;

public class DragonLunch {
  private Stack<String> stack;
  private Vector<Person> people;
  
  public DragonLunch() {                       
    people = new Vector<Person>();
    stack = new Stack<String>();
  }
  
  public void kindnap(Person p) {
    people.add(p);
  }
  
  public boolean willDragonEatOrNot() {
    for(int i = 0; i < people.size() - 1; i++) {
      if(people.get(i).gender == Gender.BOY)
        stack.push("B");
      else if(stack.isEmpty())
        return true;
      else 
        stack.pop();
    }
    return stack.isEmpty();
  }
}
