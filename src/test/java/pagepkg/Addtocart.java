package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {

	WebDriver dr;
	
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")
	WebElement Viewproduct;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement Addtocart;
	
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement Viewcart;
	
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[3]/button")
	WebElement Continueshopping;
	
	public Addtocart(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void Addtocartmtd() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,500)");
		Viewproduct.click();
		Thread.sleep(1000);
		Addtocart.click();
		Thread.sleep(1000);
		Viewcart.click();
		dr.navigate().back();
		Continueshopping.click();
	}
}
