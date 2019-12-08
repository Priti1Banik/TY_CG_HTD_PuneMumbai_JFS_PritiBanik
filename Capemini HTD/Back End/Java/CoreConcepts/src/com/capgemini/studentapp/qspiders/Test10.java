package com.capgemini.studentapp.qspiders;

import com.capgemini.studentapp.jspiders.*; //* will import all the classes and interface in a package

public class Test10 {
	public static void main(String[] args) {
		QTP q=new QTP();
		q.teachQTP();
		
		Selenium s=new Selenium();
		s.teachSelenium();
		
		React r= new React();
		r.teachReact();
		
		Angular a=new Angular();
		a.teachAngular();
	}

}
