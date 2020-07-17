package com.assingement.java;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tables {
	
	public void tableelements(WebDriver browser,By by) {
		
		
    	
    	////*[@id="transactionTable"]/tbody/tr[2]/td[1]
    	////*[@id="transactionTable"]/tbody/tr[3]/td[1]
    	////*[@id="transactionTable"]/tbody/tr[10]/td[1]
    	
		java.util.List<WebElement> rows = browser.findElements(by.xpath("//table[@id='transactionTable']/tbody/tr["));
		int rowcount = rows.size();
		
    	String beforeXpath = "//*[@id='transactionTable']/tbody/tr[";
    	String afterXpath = "]/td[1]";
    	
    	for(int i = 2; i<=rowcount;i++) {
    		
    		String actualXpath = beforeXpath+i+afterXpath;
    		WebElement ele1 = browser.findElement(by.xpath(actualXpath));
    		System.out.println(ele1.getText());
    	}
    	////*[@id="transactionTable"]/tbody/tr[1]/td[2]/a
    	
    	String afterXpath2 = "]/td[2]/a";
    	
for(int i = 2; i<=rowcount;i++) {
    		
    		String actualXpath = beforeXpath+i+afterXpath2;
    		WebElement ele1 = browser.findElement(by.xpath(actualXpath));
    		System.out.println(ele1.getText());
    	}


    	
	}
	
	}

	
	
