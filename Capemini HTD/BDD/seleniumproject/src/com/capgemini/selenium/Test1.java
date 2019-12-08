package com.capgemini.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testOne() throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);
		driver.close();
		}
}
