package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropDown {
	WebDriver driver;
	@BeforeMethod
	public void startUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	}
	@Test
	public void multipleSelect(){
		Select select1= new Select(driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select")));
		/*WebElement selec2= driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select");
		List <WebElement> alloptions= select1.findElements(By.tagName("option"));
		for(WebElement onebyoneclick: alloptions)
		{
		*/	//String valu=onebyoneclick.getAttribute("value");
			//System.out.println(valu);
		select1.selectByIndex(10);
			
	
		}
		
			
	
	@AfterMethod
	public void stop()
	{
		driver.close();
	}
}
