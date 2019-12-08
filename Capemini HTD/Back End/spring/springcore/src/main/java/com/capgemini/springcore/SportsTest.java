package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Sports;

public class SportsTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");
		Sports sports = context.getBean("sports", Sports.class);

		System.out.println("Sports name = " +sports.getName());
		System.out.println("Sports total players = " +sports.getTotalPlayers());
		System.out.println("Sports team info = " +sports.getTeamInfo());
	}
}
