package jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;
	
	@BeforeTest
	public void launchApplication()
	{
    driver=new ChromeDriver();
		
		//2) Navigate to application
		// object.method()
		driver.get("https://facebook.com");
		
	}
	@Test
	public void titleVerification()
	{
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
