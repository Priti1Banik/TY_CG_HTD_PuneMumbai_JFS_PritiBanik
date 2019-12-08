package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();

	al.add(9.78);
	al.add(77.67);
	al.add(12.98);
	al.add(44.57);

for(int i = 0;i<4;i++) {
	Double r = al.get(i);
	System.out.println(r);
}


}
}
