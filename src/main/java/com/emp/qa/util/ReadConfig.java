package com.emp.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	
	{
		
		File src = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\emp\\qa\\config\\config.properties");
				
		
		try
		{
		FileInputStream fis = new FileInputStream(src);
		
		pro = new Properties();
		pro.load(fis);
		}
		 catch (Exception e) {
			 
			 System.out.println("Exception is " + e.getMessage() );
			 
		 }
		
		
		
	}
	
	
public String getApplicationURL()
	
	{
		String url = pro.getProperty("TestUrl");
		return url;
	}
	
public String getUsername()
	
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	
public String getPassword()

{
	String password = pro.getProperty("password");
	return password;
}


public String getChromepath()

{
	String chromepath = pro.getProperty("chromepath");
	return chromepath;
}


public String getedgePath()

{
	String edgepath = pro.getProperty("edgepath");
	return edgepath;
}

public String getFirefoxpath()

{
	String firefoxpath = pro.getProperty("firefoxpath");
	return firefoxpath;
}

public String getOperapath()

{
	String Operapath = pro.getProperty("operapath");
	return Operapath;
}

public static String getProperty(String string) {
	// TODO Auto-generated method stub
	return string;
}
	
	
	
	
	
	
	
	
	
	
	
	

}
