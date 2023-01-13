package AllForPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		//driver.get("https://www.calculator.net/");
		//Find radioButtons on WebPage
		List <WebElement> radioButtonsList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//Print total no of Radio Buttons
		System.out.println("Total no of RadioButtons on web page : " + radioButtonsList.size());
		
		driver.close();

	}

}
