package com.assingement.java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class parabank {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver Browser=new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(Browser,10);
		Browser.get("https://parabank.parasoft.com/parabank/register.htm");
		Browser.manage().window().maximize();
		Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        parabankfunctions test1 = new parabankfunctions();
        Currentdate test2 = new Currentdate();
        //test1.Parabankregester(Browser);
        test1.Parabanklogin(Browser);
        test1.NewAccountcreation(Browser);
        test1.Accounttransfer(Browser);
        //test1.Viewtransaction(Browser);
        test1.ViewAccountoverview(Browser);
        
		
	}

}
