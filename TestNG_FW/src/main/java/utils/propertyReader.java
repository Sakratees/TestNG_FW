package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import base.baseClass;

public class propertyReader 
{
	// Read the property file values in resources
	// Create a propertyReader instance and call readitem with string

	public static Properties properties;

	// Load the file from resources
	public static void loadAllProperties()
	{
		properties = new Properties();
		String filename = null;
		try {
			filename = System.getProperty("user.dir")+"/src/main/resources/config.properties";
			properties.load(new FileInputStream(filename));
			baseClass.browserName = (String) properties.get("browser");
			baseClass.url = (String) properties.get("url");
			baseClass.username_txt = (String) properties.get("username");
			baseClass.password_txt = (String) properties.get("password");
			baseClass.user_txt = (String) properties.get("user");
			baseClass.amt_txt = (String) properties.get("amount");
			baseClass.des_txt = (String) properties.get("description");
			baseClass.responce_txt = (String) properties.get("success_responce");
			baseClass.homePageTitle_txt = (String) properties.get("homePageTitle");

		}catch (IOException e) {
			throw new RuntimeException("Not able to find the property file "+filename); 
		}
	}

}
