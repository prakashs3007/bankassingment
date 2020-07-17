package com.assingement.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assingement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver Browser=new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(Browser,10);
		Browser.get("https://demoqa.com/");
		Browser.manage().window().maximize();
		Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		methods  test = new methods();		
		test.Practiceform(Browser);
		Thread.sleep(1000);
		test.Bookstoreapplication(Browser);
		Thread.sleep(1000);
		Browser.close();

	}
	@Test
public static void Demoqa() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	
	WebDriver Browser=new ChromeDriver();
	WebDriverWait wait =new WebDriverWait(Browser,10);
	Browser.get("https://demoqa.com/");
	Browser.manage().window().maximize();
	Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	methods  test = new methods();		
	test.Practiceform(Browser);
	Thread.sleep(1000);
	test.Bookstoreapplication(Browser);
	Thread.sleep(1000);
	Browser.close();
}
}
