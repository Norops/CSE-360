package cse360assignment02;

public class AddingMachine {
  private int total;
  StringBuffer Strings;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    Strings= new StringBuffer("0");// creating a string buffer to store values
  }
  
  public int getTotal () {
    return total;// returning the total value
  }
  
  public void add (int value) {
	  total= total +value;//adding value to the total
	  Strings.append(" + "+value);//adding value to the String buffer
  }

  public void subtract (int value) {
	  total=total-value;//subtracting value from the total
	  Strings.append(" - "+value);//adding value to the String buffer
  }

  public String toString () {
    return Strings.toString();// returning the string buffer
  }

  public void clear() {
	  Strings.delete(0,Strings.length());// clears the buffer from all strings
	  Strings.append("0");// return the initial value of 0 in the buffer
  }
}