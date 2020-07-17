package com.assingement.java;

import java.io.IOException;

import org.testng.annotations.Test;

public class Parabankpropertyfile extends datareader{
	
	@Test
	public void testdata() throws IOException {

	String name1  = getobject("firstname2");
	System.out.println(name1);
	String name2 = getobject("lastname3");
	System.out.println(name2);
	
	
	
	
	
	
	}
}
