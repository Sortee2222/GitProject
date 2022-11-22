package org.propertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader //Generic Method for getting Properties
{

	public String getPropData(String key)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./PropertiesFiles/Config.properties"); 
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}

	}

}
