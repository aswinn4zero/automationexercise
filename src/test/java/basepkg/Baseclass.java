package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver dr;
	
	@BeforeTest
	public void setUp()
	{
		dr= new ChromeDriver();//open chrome browser
	}
	@Test
	public void openurl()
	{
		dr.get("https://automationexercise.com/");
		dr.manage().window().maximize();
	}
}
