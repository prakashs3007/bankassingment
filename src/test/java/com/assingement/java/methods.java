package com.assingement.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class methods {
	public void Practiceform(WebDriver Browser) throws InterruptedException
	 {
		subfunctions obj=new subfunctions();
		xpath path = new xpath();
		obj.click(Browser, path.forms());
		obj.click(Browser, path.Practiceform());
		obj.setText(Browser, path.Firstname(),"Prakash");
		obj.setText(Browser, path.Lastname(), "Selvaraj");
		obj.setText(Browser, path.emailid(), "sprakashakv@gmail.com");
		obj.radiobutton(Browser, path.Radiobutton());
		obj.setText(Browser, path.Phonenumber(), "0559599136");
		obj.click(Browser, path.Dateofbirth());
		obj.select(Browser, path.month(), "July");
		obj.select(Browser, path.year(), "1993");
		obj.click(Browser, path.day(8));
		obj.selectkey(Browser, Keys.TAB);
		obj.click(Browser, path.Emptyspace());
		obj.click(Browser, path.Dateofbirth());
		obj.setText(Browser, path.Subjects(), "Maths");
		obj.selectkey(Browser, Keys.TAB);
		obj.click(Browser, path.Hobbies());
		obj.setText(Browser, path.Address(), "Testing123");
		obj.click(Browser, path.State());
		Thread.sleep(1000);
		obj.setText(Browser, path.State(), "Uttar Pradesh");
		obj.selectkey(Browser, Keys.TAB);
		Thread.sleep(1000);
		obj.setText(Browser, path.City(), "Agra");
		Thread.sleep(1000);
		obj.selectkey(Browser, Keys.TAB);
		obj.click(Browser, path.Submit());
		Thread.sleep(1000);
		obj.click(Browser, path.practiceformclose());
		
	}
	
	public void Bookstoreapplication(WebDriver Browser) throws Throwable
	{
		subfunctions obj2=new subfunctions();
		xpath path2 = new xpath();
		
		
	obj2.click(Browser, path2.Bookstore());
	Thread.sleep(1000);
	obj2.click(Browser, path2.Bookstorelogin());
	Thread.sleep(1000);
	obj2.setText(Browser, path2.Bookstoreusername(), "prakashs");
	Thread.sleep(1000);
	obj2.setText(Browser, path2.Bookstorepassword(), "Maveric@123");
	Thread.sleep(1000);
	obj2.click(Browser, path2.clicklogin());
	Thread.sleep(1000);
	obj2.click(Browser, path2.gotobookstore());
	Thread.sleep(1000);
	obj2.setText(Browser, path2.Searchbook(),"git" );
	Thread.sleep(1000);
	//obj2.click(Browser, path2.clicksearchbook());
	obj2.click(Browser, path2.Gitpocketguide());
	Thread.sleep(1000);
	obj2.click(Browser, path2.Addtoyourcollection());
	Thread.sleep(1000);
	obj2.alertAccept(Browser);
	obj2.click(Browser, path2.Bookstoreprofile());
	Thread.sleep(1000);
	obj2.click(Browser, path2.deletebook());
	Thread.sleep(1000);
	obj2.click(Browser, path2.popupclickok());
	Thread.sleep(1000);
	obj2.alertAccept(Browser);
	Thread.sleep(1000);
	obj2.click(Browser, path2.logout());
			
		
	}

}
