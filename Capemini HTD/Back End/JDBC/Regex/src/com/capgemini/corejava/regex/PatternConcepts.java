package com.capgemini.corejava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternConcepts {

	static Pattern pattern;
	static Matcher matcher;   //matcher will takes the input that needs to be match
	
	public static void main(String[] args) {
		pattern = Pattern.compile("\\d");// '\\d'->it will check for only single digit(0-9)
		matcher = pattern.matcher("1");
		System.out.println("pattern \\d: "+matcher.matches());
	
		pattern = Pattern.compile("\\D");// '\\D'->it will not check for digit(0-9)
		matcher = pattern.matcher("8");
		System.out.println("pattern \\D: "+matcher.matches());
		
		pattern = Pattern.compile("\\d+");// '\\d+'->it will check more than one digit(above 10) 
		matcher = pattern.matcher("1178786568");
		System.out.println("pattern \\d+: "+matcher.matches());
		
		pattern = Pattern.compile("\\d{10}");// '\\d{10},specified digit- {10} is the maximum limits of digit
		matcher = pattern.matcher("27298918987");
		System.out.println("pattern \\d{10}: "+matcher.matches());
	
		pattern = Pattern.compile("\\d{0}");// '\\d{0},accept 0 element
		matcher = pattern.matcher("27298918987");
		System.out.println("pattern \\d{0}: "+matcher.matches());
		
		pattern = Pattern.compile("\\d{1,10}");// '\\specified digit- {1,10} is the maximum limits of digit and minimum is 1
		matcher = pattern.matcher("27298918987");
		System.out.println("pattern \\d{1,10}: "+matcher.matches());
		
		pattern = Pattern.compile("\\s");// '\\s->checks for single space
		matcher = pattern.matcher(" ");
		System.out.println("pattern \\s: "+matcher.matches());
		
		pattern = Pattern.compile("\\s+");// '\\s->checks for multiple space and 'S' for not checking space
		matcher = pattern.matcher("   ");
		System.out.println("pattern \\s+: "+matcher.matches());
		
		pattern=Pattern.compile("\\w");//'\\w'->it will check one character
		matcher = pattern.matcher("A");
		System.out.println("pattern \\w: "+matcher.matches());
		
		pattern = Pattern.compile("\\W");// '\\W'->it will not check for character
		matcher = pattern.matcher("A");
		System.out.println("pattern \\W: "+matcher.matches());
		
		pattern = Pattern.compile("\\w+");// '\\w+'->it will check more than one character(above 10)
		matcher = pattern.matcher("AJDJCDCSJNCNK");
		System.out.println("pattern \\w+: "+matcher.matches());
	}
}