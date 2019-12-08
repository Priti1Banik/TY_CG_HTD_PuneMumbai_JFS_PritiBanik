package com.capgemini.corejava.array;

public class Testc {
public static void main(String[] args) {
	int[] a= new int[4];
	a[0]=2;
	a[1]=3;
    a[2]=4;
    a[3]=5;
    for(int i=0;i<a.length;i++) {  //arr.length count the length of array
    	System.out.println(a[i]);
    }
    int[] b= {1,2,3,4};
    for(int i=0;i<a.length;i++) {  //arr.length count the length of array
    	System.out.println(b[i]);
    }
    
    
}
}
