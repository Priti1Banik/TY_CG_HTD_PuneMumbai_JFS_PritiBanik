package com.capgemini.corejava.classobject;

public class Test13 {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Marker m = new Marker(1, "Camlin");
		
		System.out.println("ID is "+m.id);
		System.out.println("Name is "+m.name);
		
		System.out.println(".....");
		Object r=m.clone();
		Marker k = (Marker)r;
		System.out.println("ID is "+k.id); 
		System.out.println("Name is "+k.name);
	}

}
