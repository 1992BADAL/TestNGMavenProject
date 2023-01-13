package AllForPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTabORWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");
		System.out.println("First Page :" + driver.getTitle());
		
		//open new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		System.out.println("second TAB :" + driver.getTitle());
		
		//get window handles of open windows
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);

	}

}
