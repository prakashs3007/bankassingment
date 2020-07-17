package com.assingement.java;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class datareader {

	static Properties properties;
	
public static void loadData() throws IOException
    
    {
    	properties = new Properties();
    	File d = new File("src\\test\\java\\testdata\\test.properties");
       	FileReader read = new FileReader(d);
    	properties.load(read);
    }

public static String getobject (String data) throws IOException {
	loadData();
	String Data = properties.getProperty(data);
	return Data; 
		
}
}
