package com.capgemini.corejava.classobject;

public class Demo2 {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.id=1;
		c.name="Priti";
		
		
		Cow d = new Cow();
		d.id=2;
		d.name="Sneha";
	
		
	
	 boolean result = c.equals(d);
    System.out.println(result);

}
}


