package Selenium;

import gherkin.lexer.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;
import com.mysql.jdbc.StringUtils;

public class ToolTip {
	static WebDriver driver;
	
	@BeforeMethod
	public void startUp() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
	driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		Thread.sleep(5);
	}
	@Test
	public void toolTipTestingwithTitle() throws InterruptedException{
	
		driver.findElement(By.id("Forms Based")).click();
		WebElement myIframe=driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/tooltip/forms.html']"));
		driver.switchTo().frame(myIframe);
		WebElement tooltip=	driver.findElement(By.id("firstname"));
		org.openqa.selenium.Point loc1=tooltip.getLocation();
		int xcor=  loc1.getX();
		int ycor=  loc1.getY();
		System.out.println(xcor + "   "+ycor);
		Actions mouseTooltip= new Actions(driver);
		mouseTooltip.moveToElement(tooltip, 100, 20).build().perform();
		String actualtooltip= tooltip.getAttribute("title");
		System.out.println(actualtooltip);
		String expected="Please provide your firstname.";
		Assert.assertEquals(actualtooltip, expected);
		//LastName tooltip validation
		WebElement LNtooltip=	driver.findElement(By.id("lastname"));
		org.openqa.selenium.Point LNloc1=LNtooltip.getLocation();
		int lnxcor=  LNloc1.getX();
		int lnycor=  LNloc1.getY();
		System.out.println(lnxcor + "   "+lnycor);
		Actions LNmouseTooltip= new Actions(driver);
		LNmouseTooltip.moveToElement(LNtooltip, 100, 20).build().perform();
		String lnactualtooltip= LNtooltip.getAttribute("title");
		System.out.println(lnactualtooltip);
		String lnexpected="Please provide also your lastname.";
		Assert.assertEquals(lnactualtooltip, lnexpected);
		}
	
	@Test(priority=0)
	public void toolTipTestingwithAnotherImage() throws InterruptedException{
		driver.findElement(By.id("Image Based")).click();
		WebElement myIframe=driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/tooltip/custom-content.html']"));
		driver.switchTo().frame(myIframe);
		 WebElement imgtoolTip= driver.findElement(By.xpath("//a[text()='Vienna, Austria']"));
		 //imgtoolTip.click();
		 org.openqa.selenium.Point loc1=imgtoolTip.getLocation();
			int xcor=  loc1.getX();
			int ycor=  loc1.getY();
			System.out.println(xcor + "   "+ycor);
			Actions mouseTooltip= new Actions(driver);
			mouseTooltip.moveToElement(imgtoolTip, 80, 90).build().perform();
			String actualtooltip= imgtoolTip.getText();
			System.out.println("Attribute is  " +actualtooltip);
			//WebElement expected= driver.findElement(By.xpath(""))
			String expected="Vienna, Austria";
			Assert.assertEquals(actualtooltip, expected);
	}

	@AfterMethod
	public void stop(){
		driver.quit();
	}
}

