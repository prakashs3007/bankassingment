package com.assingement.java;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class subfunctions {
	 public void click(WebDriver driver, By by) {
	 	        //waitVisible(driver, by);
	        WebElement ele = driver.findElement(by);
	        try {
	            ele.click();
	        }catch (Exception e) {
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].click();", ele);
	        }
	    }
    
    public void setText(WebDriver browser, By by, String text) {
        System.out.println(text);
        WebElement ele = browser.findElement(by);
        try {
        	System.out.println(ele.getTagName());
        	ele.clear();
            ele.sendKeys(text.replaceAll(Character.toString('"'), ""));
        }catch (Exception e) {
        	e.printStackTrace();
            JavascriptExecutor executor = (JavascriptExecutor) browser;
            executor.executeScript(String.format("arguments[0].value='%s';",text), ele);
        }     
             
    }
    
    public void Select2(WebDriver browser, By by,int Index) {
    	Select obj = new Select(browser.findElement(by));
        obj.selectByIndex(Index);
    }
    
    
   

	public void select(WebDriver browser,By by,String visible) {
  	       
        Select obj = new Select(browser.findElement(by));
        obj.selectByVisibleText(visible);

               
    }
    
    public void selectkey(WebDriver browser,CharSequence key) {
    	
    	 Actions builder = new Actions(browser);
         Actions series = builder.sendKeys(key);
         series.perform();
    }

    public void checkBox(WebDriver browser, By by, boolean status) {
        WebElement ele = browser.findElement(by);
        if (ele.isSelected() != status) {
            ele.click();
        }
    }
    
    public String gettext(WebDriver browser , By by) {
    	WebElement ele= browser.findElement(by);
    	return ele.getText();
    }
   

    public void radiobutton(WebDriver browser,By by ) {
    	WebElement ele= browser.findElement(by);
    	ele.click();
    }
 
    public void assertion(String text1 ,String text2, String text3 ) {
    	
    	Assert.assertEquals(text1 , text2, text3);
    }
    
   

    public void switchFrame(WebDriver browser, By by) {
        
        browser.switchTo().frame(browser.findElement(by));
        
    }
    
    public class SortablePage {

        private final WebDriver driver;

        private SortablePage sortable;

        public SortablePage(final WebDriver driver){
            this.driver = driver;
        }

        public void goTo() {
            
            this.driver.switchTo().frame(0);
            this.sortable = new SortablePage(driver);
        }

        public SortablePage getSortables() {
            return sortable;
        }

    }

 
    public void draganddrop(WebDriver browser , By by) {

    	browser.navigate().to("url");
    	WebElement ele = browser.findElement(by);
    	WebElement ele2= browser.findElement(by);
    	Actions act = new Actions(browser);
    	act.dragAndDrop(ele,ele2).build().perform();

    	
    }

    public void switchParentFrame(WebDriver browser) {
        
        browser.switchTo().parentFrame();
        
    }
    

 

    public void switchDefaultFrame(WebDriver browser) {
        
        browser.switchTo().defaultContent();    
        
    }
    
    
 public void alertAccept(WebDriver driver) {
        
        driver.switchTo().alert().accept();
        
    }
 
public void windowhandle(WebDriver browser , By by,String handle ) {
	String handle1 = browser.getWindowHandle();
	Set<String> handle11= browser.getWindowHandles();
	for (String handle111 : browser.getWindowHandles()){
		browser.switchTo().window(handle111);
		}
}

 

    public void maximize(WebDriver driver) {
        
        driver.manage().window().maximize();
        
    }
    
    
  
    
    

}
