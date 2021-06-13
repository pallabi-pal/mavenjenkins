package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{
	@Parameters("Browser")
	@Test
	public void startBrowser(String localbrowser)
	{	
		
		System.out.println("Parameter value is "+localbrowser);
		WebDriver driver=null;
		
		if(localbrowser.contains("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		
		else if(localbrowser.contains("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
				
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		System.out.println("Yayy");
		driver.quit();
	}
	
	
}
