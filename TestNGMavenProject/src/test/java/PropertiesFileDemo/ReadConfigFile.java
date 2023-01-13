package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	Properties properties;
	String path = "C:\\Users\\Badal\\git\\repository2\\TestNGMavenProject\\src\\test\\java\\PropertiesFileDemo\\Config.properties";

	public ReadConfigFile() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
	}
	public String getUrl()
	{
		String url = properties.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified in cong file.");
	}
	
	public String getUserName()
	{
		String usename = properties.getProperty("username");
		if(usename!=null)
			return usename;
		else
			throw new RuntimeException("url not specified in cong file.");
	}
	
	public String getPassword()
	{
		String password = properties.getProperty("password");
		if(password!=null)
			return password;
		else
			throw new RuntimeException("password not specified in cong file.");
	}
}
