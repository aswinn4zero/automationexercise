package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {

	WebDriver dr;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement Signin;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement Login;
	
	public Loginclass(WebDriver dr)
	{
		System.out.println("inside constructor");
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	public void Siginbtn()
	{
		Signin.click();
	}
	public void setValues(String email, String pass) throws Exception
	{
		Email.clear();
		Email.sendKeys(email);
		Password.clear();
		Password.sendKeys(pass);
	}
	public void Loginbutton()
	{
		Login.click();
	}
}
