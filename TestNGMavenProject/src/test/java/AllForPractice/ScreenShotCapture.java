package AllForPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.skyvill.in/");

//		// Capture Full page Screenshot
//		// Step1: convert WebDriver object to TakeScreenshot interface
//		TakesScreenshot screenshot = ((TakesScreenshot) driver);
//
//		// Step2: Call getScreenshotAs method to create image file
//		File src = screenshot.getScreenshotAs(OutputType.FILE);
//
//		File dest = new File("C:\\Users\\Badal\\Workspace\\TestNGMavenProject\\ScreenShot\\fullpage.png");
//
//		// Step3: Copy image file to destination
//		FileUtils.copyFile(src, dest);		
		
		// Capture section of web page Screenshot
		WebElement section = driver.findElement(By.xpath("//*[@id=\"post-855\"]/div/div/section[4]/div/div/div"));
		
		//Step2: Call getScreenshotAs method to create image file
		File src = section.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Badal\\Workspace\\TestNGMavenProject\\ScreenShot\\Sectionpage.png");
		
		//Step3: Copy image file to destination
		FileUtils.copyFile(src, dest);

	}

}
