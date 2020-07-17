package com.assingement.java;

import org.openqa.selenium.By;

public class xpath {

	public By Bookstore() {
        return By.xpath("//div[text()='Book Store Application']");
		//return By.xpath("//*[text()='Book Store Application']");
    }
	
	public By clicklogin() {
		return By.xpath("//button[@id='login']");
	}
	public By captia() {
		return By.xpath("//span[@id='recaptcha-anchor']");
	}
	
	public By Bookstorelogin() {
		return By.xpath("//span[text()='Login']");
	}
	
	public By gotobookstore() {
		return By.xpath("//button[@id='gotoStore']");
	}
	
	public By logout() {
		return By.xpath("(//button[@id='submit'])[1]");
	}
	
	public By Addtoyourcollection() {
		return By.xpath("//*[text()='Add To Your Collection']");
	}
	
	public By Bookstoreusername() {
		return By.xpath("//input[@id='userName']");
		}
	public By Bookstorepassword() {
		return By.xpath("//input[@id='password']");
	}
	
	public By Bookstorenewuser() {
		return By.xpath("//button[@id='newUser']");
		
	}
	
	public By deletebook() {
		return By.xpath("//span[@id='delete-record-undefined']");
	}
	
	public By popupclickok() {
return By.xpath("//button[@id='closeSmallModal-ok']");
	}
	//*public By Bookstorenewuserfirstname() {
		//return By.xpath("//input[@id='firstname']");
	//}
	
	//public By BookstorenewuserLastname() {
		//return By.xpath("//input[@id='lastname']");
	//}
	
	public By Bookstoreloginnew() {
		return By.xpath("//button[@id='login']");
	}
	
	public By Bookstoremenu() {
		return By.xpath("//span[text()='Book Store']");
	}
	
	public By Gitpocketguide() {
		return By.xpath("//*[text()='Git Pocket Guide']");
	}
	
	//public By LearningJavascriptdesign() {
		//return By.xpath("//span[@id='see-book-Learning JavaScript Design Patterns']");
	//}
	
	//public By DesignEvolvableweb() {
		//return By.xpath("//span[@id='see-book-Designing Evolvable Web APIs with ASP.NET']");
//}
	public By Searchbook() {
		return By.xpath("//input[@id='searchBox']");
		
	}
	
	public By clicksearchbook() {
		return By.xpath("//span[@id='basic-addon2']");
	}
	
	public By Bookstoreprofile() {
		return By.xpath("//span[text()='Profile']");
	}
	
	public By forms() {
		return By.xpath("//*[text()='Forms']");
	}
	
	public By Practiceform() {
		return By.xpath("//span[text()='Practice Form']");
	}
	
	public By Dateofbirth() {
		return By.xpath("//input[@id='dateOfBirthInput']");
	}
	
	public By Phonenumber() 
	{
		return By.xpath("//input[@placeholder='Mobile Number']");
	}
	
	public By emailid()
	{
		return By.xpath("//input[@id='userEmail']");
	}
	
	public By Firstname() 
	{
		return By.xpath("//input[@id='firstName']");
		
	}
	
	public By Lastname() 
	{
		return By.xpath("//input[@id='lastName']");
	}
	
	public By Radiobutton() 
	{
		return By.xpath("//input[@type='radio']/following-sibling::*[contains(., 'Male')]");
	}
	
	public By Subjects() 
	{
		return By.xpath("//input[@id='subjectsInput']");
	}
	
	public By Hobbies() 
	{
		return By.xpath("//label[@for='hobbies-checkbox-1']");
	}
	
	public By month()
	{
		return By.xpath("//select[@class='react-datepicker__month-select']");
	}
	
	public By year() 
	{
		return By.xpath("//select[@class='react-datepicker__year-select']");
		}
	
	public By day(Integer date) 
	{
		return By.xpath("//div[@class='react-datepicker__day react-datepicker__day--" + String.format("%03d", date) + "']");
	}
	
	public By Address() {
		return By.xpath("//textarea[@id='currentAddress']");
	}
	
	public By Emptyspace() {
		return By.xpath("//div[@id='app']");
	}
	
	public By State() {
		return By.xpath("(//div[@class=' css-1hwfws3']//div/input)[1]");
	}
	
	public By City() {
		return By.xpath("(//div[@class=' css-1hwfws3']//div/input)[2]");
	}
	
	public By practiceformclose() {
		return By.xpath("//button[@id='closeLargeModal']");
	}
	public By Submit() {
		return By.xpath("//button[@id='submit']");
	}
	
	public By typeofaccount() {
		return By.xpath("//select[@id='type']");
	}
	
	public By selectsavingsaccount() {
		return By.xpath("//option[@value='1']");
	}
}
