package com.assingement.java;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class parabankfunctions {
	
	String newaccountnumber = "";

	public void Parabankregester(WebDriver Browser) throws InterruptedException, Throwable
	{
		subfunctions fun = new subfunctions();
		Parabankpropertyfile obj3 = new Parabankpropertyfile();
		parabankxpath path3 = new parabankxpath();
		datareader dataread = new datareader();
		fun.setText(Browser,path3.firstnamebank(),dataread.getobject("firstname2"));
		fun.setText(Browser,path3.Lastnamebank(),dataread.getobject("lastname3"));
		fun.setText(Browser,path3.Address(),dataread.getobject("address"));
		fun.setText(Browser,path3.city(), dataread.getobject("city"));
		fun.setText(Browser,path3.state(),dataread.getobject("state"));
		fun.setText(Browser,path3.Zipcode(),dataread.getobject("zipcode"));
		fun.setText(Browser,path3.phonenumber(),dataread.getobject("phone"));
		fun.setText(Browser,path3.SSN(),dataread.getobject("ssn"));
		fun.setText(Browser,path3.username1(),dataread.getobject("username"));
		fun.setText(Browser,path3.password1(),dataread.getobject("password"));
		fun.setText(Browser,path3.confirmpassword(),dataread.getobject("confirm"));
		fun.click(Browser, path3.regester());
		fun.click(Browser, path3.logout());
			
	}
	
	public void Parabanklogin(WebDriver Browser) throws Throwable
	{
		subfunctions fun2 = new subfunctions();
		Parabankpropertyfile obj4 = new Parabankpropertyfile();
		parabankxpath path4 = new parabankxpath();
		datareader dataread1 = new datareader();
		fun2.setText(Browser, path4.enterusername(),dataread1.getobject("username"));
		Thread.sleep(1000);
		fun2.setText(Browser, path4.enterpassword(),dataread1.getobject("password"));
		Thread.sleep(1000);
		fun2.click(Browser, path4.Loginparabank());
				
	}
	
	public void NewAccountcreation(WebDriver Browser) throws Throwable {
		
		subfunctions fun3 = new subfunctions();
		Parabankpropertyfile obj5 = new Parabankpropertyfile();
		parabankxpath path5 = new parabankxpath();
		datareader dataread2 = new datareader();
		fun3.click(Browser, path5.Opennewaccount());
		Thread.sleep(1000);
		//fun3.click(Browser, path5.selectaccounttype());
		//Thread.sleep(1000);
		fun3.select(Browser, path5.selectaccounttype(),"SAVINGS");
		fun3.selectkey(Browser, Keys.TAB);
		fun3.Select2(Browser, path5.fromaccount(),0);
		Thread.sleep(1000);
		fun3.click(Browser, path5.createnewaccount());
		Thread.sleep(1000);
		fun3.assertion("Account Opened!","Account Opened!", "Account was not opened successfully");
		Thread.sleep(1000);
		newaccountnumber =fun3.gettext(Browser, path5.newAccNum());
		System.out.println("New Account number is "+newaccountnumber);
	}
	
	public void Accounttransfer(WebDriver Browser) throws Throwable {
		subfunctions fun4 = new subfunctions();
		Parabankpropertyfile obj6 = new Parabankpropertyfile();
		parabankxpath path6 = new parabankxpath();
		datareader dataread3 = new datareader();
		fun4.click(Browser, path6.Fundtrnasfer());
		Thread.sleep(1000);
		fun4.setText(Browser, path6.enteramount(),dataread3.getobject("amount"));
		Thread.sleep(1000);
		fun4.Select2(Browser, path6.fromaccount1(),1);
		Thread.sleep(1000);
		fun4.Select2(Browser, path6.toaccount(),0);
		Thread.sleep(1000);
		fun4.click(Browser, path6.transferfundbutton());
		Thread.sleep(1000);
			 
	}
	
	public void Viewtransaction(WebDriver Browser) throws Throwable {
		subfunctions fun5 = new subfunctions();
		Parabankpropertyfile obj7= new Parabankpropertyfile();
		parabankxpath path7 = new parabankxpath();
		datareader dataread4 = new datareader();
		
		fun5.click(Browser, path7.findtransaction());
		Thread.sleep(1000);
		fun5.Select2(Browser, path7.selectaccountforfindtransaction(),1);
		Thread.sleep(1000);
	    
	    Thread.sleep(1000);
	    fun5.click(Browser, path7.findtransaction2());
	    Thread.sleep(1000);
		
	}
	
	public void ViewAccountoverview (WebDriver Browser) throws Throwable {
		subfunctions fun5 = new subfunctions();
		Parabankpropertyfile obj7= new Parabankpropertyfile();
		parabankxpath path7 = new parabankxpath();
		datareader dataread4 = new datareader();
		
		fun5.click(Browser, path7.Accountoverview());
		Thread.sleep(1000);
		String accountbalance = fun5.gettext(Browser, path7.Accountdata(newaccountnumber,1));
		System.out.println("Balance"+accountbalance);
		String accountbalance1 = fun5.gettext(Browser, path7.Accountdata(newaccountnumber,2));
		System.out.println("Available amount"+accountbalance1);
		
		
	}
	

}
