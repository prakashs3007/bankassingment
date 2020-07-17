package com.assingement.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Currentdate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
	    Date date = new Date();
	    //System.out.println(df.format(date));
	    FileOutputStream out = new FileOutputStream("test.properties");
        FileInputStream in = new FileInputStream("test.properties");
        Properties props = new Properties();
        props.load(in);
        in.close();
        props.setProperty("findbydate", df.format(date) );
        props.store(out, null);

	}

}
