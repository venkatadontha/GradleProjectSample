package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest01 {
	
	WebDriver dr;
	
	@Test
	public void sampleTest() throws InterruptedException
	{
		System.out.println("Chrome Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Documents\\JAVA\\CoreDemoAutomation\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		System.out.println("CHROME Browser");
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		
		dr.get("http://automationpractice.com/index.php");
		dr.findElement(By.xpath("//a[@class='login']")).click();
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("rajakishore.test01@yopmail.com");
		dr.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Test@12345");
		dr.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		Thread.sleep(2500);
		dr.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(2500);
		dr.quit();	
	}	

}
