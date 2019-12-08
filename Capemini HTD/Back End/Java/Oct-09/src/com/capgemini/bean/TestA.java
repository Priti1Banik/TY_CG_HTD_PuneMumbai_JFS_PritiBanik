package com.capgemini.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
  s.setName("Priti");
  s.setId(12);
  s.setHeight(5.6);
  Database db = new Database();
  db.recieve(s);
}
}
