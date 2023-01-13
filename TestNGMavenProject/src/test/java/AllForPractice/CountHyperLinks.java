package AllForPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLinks {

	public static void main(String[] arg) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//launch web page "https://www.calculator.net/"
		driver.get("https://www.calculator.net/");
//Make a list of all the Hyperlink
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
//Count the Size of the list
		System.out.println("Total links on webpage :" + linkElements.size());
		
		for(WebElement el:linkElements)
		{
			System.out.println(el.getText());
		}
		
		driver.close();
	}

}
