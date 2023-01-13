package AllForPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);
		
		//Select by visible text
		//dropdown.selectByVisibleText("Iceland");
		
		//Select by value
		//dropdown.selectByValue("2");
		
		//dropdown.selectByIndex(12);
		
		//Is multiple method
		if(dropdown.isMultiple()) {
			System.out.println("dropdown is multiple");
		}
		else {
			System.out.println("dropdown is not multiple");
		}
		
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		
		System.out.println("Total options:" + alldropdownoptions.size());
		for(WebElement el :alldropdownoptions) {
			System.out.println(el.getText());
		}
		
		driver.close();

	}

}
