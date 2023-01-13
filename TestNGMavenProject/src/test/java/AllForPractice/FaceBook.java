package AllForPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/login/");
		System.out.println("page Title1 :"+ driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("mondalbadal79@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@@Badal79@@");
	    //driver.findElement(By.id("u_0_4_EX")).click();
		driver.findElement(By.id("loginbutton")).click();
		
		System.out.println("page Title :"+ driver.getTitle());

	}

}
