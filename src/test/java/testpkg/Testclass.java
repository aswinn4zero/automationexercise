package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basepkg.Baseclass;
import pagepkg.Addtocart;
import pagepkg.Loginclass;
import pagepkg.Screenshot;
import utilitypkg.Utilityclass;

public class Testclass extends Baseclass{

	
	@Test(priority =3)
	
	public void Verifylogin() throws Exception
	{
		
		Loginclass log=new Loginclass(dr);
	
		   log.Siginbtn();
	    String xl = "C:\\Users\\aswin\\Desktop\\aswinautomation.xlsx";
        String Sheet = "Sheet1";
        int rowCount = Utilityclass.getRowCount(xl, Sheet);
        System.out.println("rowcount="+rowCount);
     
        for (int i=1;i<=rowCount;i++)
        {String email=Utilityclass.getCellValue(xl, Sheet, i, 0);
         System.out.println("username---"+email);
         String password=Utilityclass.getCellValue(xl, Sheet, i, 1);
         System.out.println("password---"+password);
         log.setValues(email,password);  
         log.Loginbutton();
         
         
        }
	}
	
	@Test(priority=5)
	
	
	public void Addtocartmtd() throws Exception
	{
		Addtocart ac=new Addtocart(dr);
		ac.Addtocartmtd();
	}
	
     @Test(priority =4) 
    
    public void Screenshotmtd() throws Exception
    {
    	Screenshot ss=new Screenshot(dr);
    	ss.Screenshotpage();
    }
       
	@Test(priority =1)
	public void TitleVerification()
	{
		String title= dr.getTitle();
		String exptitle="Automation Exercise";
		System.out.println("Title="+title);
		if(title.equalsIgnoreCase(exptitle))
		{
			System.out.println("TITLE IS PRESENT");
		}
		else {
			System.out.println("NOT PRESENT");
		}
	}	
        
	@Test(priority =2)
	public void TextVerification() {
	
		String s=dr.getPageSource();

		if(s.contains("Features Items")) 
		{
			System.out.println(" TEXT IS PRESENT");
		}
		else
		{
			System.out.println("NOT PRESENT");
		}
	}

	}







	
