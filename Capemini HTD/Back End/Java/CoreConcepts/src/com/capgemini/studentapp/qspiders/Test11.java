package com.capgemini.studentapp.qspiders;
import com.capgemini.studentapp.jspiders.Remote;
public class Test11 {
	public static void main(String[] args) {
		Remote.on(); //class_name.on()
		System.out.println(Remote.sum);
		Remote r =new Remote();
		r.off();
		System.out.println(r.count);
		
	}
	

}
