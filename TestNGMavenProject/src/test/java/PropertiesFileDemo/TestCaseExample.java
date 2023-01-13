package PropertiesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		ReadConfigFile ConfigFile = new ReadConfigFile();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(ConfigFile.getUrl());
		
		//driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ConfigFile.getUserName());
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigFile.getPassword());
	
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
