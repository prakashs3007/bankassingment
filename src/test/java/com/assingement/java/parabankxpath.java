package com.assingement.java;
import org.openqa.selenium.By;

public class parabankxpath {
	
	public By firstnamebank() {
		return By.xpath("//input[@id='customer.firstName']");
	}
	
	public By Lastnamebank() {
return By.xpath("//input[@id='customer.lastName']");
	}
	
	public By Address() {
		
	return By.xpath("//input[@id='customer.address.street']");
	}
	
	public By city() {
		return By.xpath("//input[@id='customer.address.city']");
	}
	
	public By state() {
		return By.xpath("//input[@id='customer.address.state']");
	}

	public By Zipcode() {
		return By.xpath("//input[@id='customer.address.zipCode']");
	}
	
	public By phonenumber() {
		return By.xpath("//input[@id='customer.phoneNumber']");
	}
	
	public By SSN() {
		return By.xpath("//input[@id='customer.ssn']");
	}
	
	public By username1() {
		return By.xpath("//input[@id='customer.username']");
	}
	
	public By password1() {
		return By.xpath("//input[@id='customer.password']");
	}
	
	public By confirmpassword() {
		return By.xpath("//input[@id='repeatedPassword']");
	}
	
	public By enterusername() {
		return By.xpath("//input[@name='username']");
	}
	
	public By enterpassword() {
		return By.xpath("//input[@name='password']");
	}
	
	public By regester() {
		return By.xpath("//input[@value='Register']");
	}
	
	public By Loginparabank() {
		return By.xpath("//input[@value='Log In']");
	}
	
	public By Opennewaccount() {
		return By.xpath("//*[text()='Open New Account']");
	}
	
	public By selectaccounttype() {
		return By.xpath("//select[@id='type']");
	}
	
	public By fromaccount() {
		return By.xpath("//select[@id='fromAccountId']");
	}
	
	public By logout() {
		return By.xpath("//*[text()='Log Out']");
	}
	
	public By createnewaccount() {
		return By.xpath("//input[@type='submit']");
	}
	
	public By Fundtrnasfer() {
		return By.xpath("//*[text()='Transfer Funds']");
	}
	
	public By enteramount() {
		return By.xpath("//input[@id='amount']");
	}
	
	public By fromaccount1() {
		return By.xpath("//select[@id='fromAccountId']");
	}
	
	public By toaccount() {
		return By.xpath("//select[@id='toAccountId']");
	}
	
	public By transferfundbutton() {
		return By.xpath("//input[@type='submit']");
	}
	
	public By findtransaction() {
		return By.xpath("//*[text()='Find Transactions']");
	}
	
	public By selectaccountforfindtransaction() {
		return By.xpath("//select[@id='accountId']");
	}
	
	public By findbydate() {
		return By.xpath("//input[@id='criteria.onDate']");
	}
	
	public By findtransaction2() {
		return By.xpath("(//button[@type='submit'])[2]");
	}
	
	public By newAccNum() {
		return By.id("newAccountId");
	}
	
	public By Accountoverview() {
		return By.xpath("//*[text()='Accounts Overview']");
	}
	
	public By Accountdata(String Accountnumber , int Index) {
		return By.xpath("//*[text()='"+Accountnumber+"']/../following-sibling::td["+Index+"]");
		
		
	}
	}
