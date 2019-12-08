package com.capg.corejava.methods;

public class Test {
public static void main(String[] args) {
	Car car1=new Car("Mustang GT","Yellow",4798546.75883);//constructor initiate variables
System.out.println(car1);
}
  public static Car print(Car Car) { //ref.class(or object) can be use as ref. variable as well as parameters
	return Car;  //ref.class(or object)can be also a return type 
	}
}
