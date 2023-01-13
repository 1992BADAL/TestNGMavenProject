package AllForPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://www.opencart.com/");
		//driver.get("https://www.skyvill.in/contact-me/");
		//find image link by Xpath
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		//driver.findElement(By.xpath("//img[@class='custom-logo']"));
		//verify homePage Title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		//if(driver.getTitle().equals("Home - SkyVill"))	
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
