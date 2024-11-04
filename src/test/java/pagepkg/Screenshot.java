package pagepkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	WebDriver dr;
	public Screenshot(WebDriver dr)
	{
		this.dr=dr;
		
	}
	public void Screenshotpage()throws Exception
	{
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src , new File("C:\\Users\\aswin\\Desktop\\screenshot.png"));
	}
}
