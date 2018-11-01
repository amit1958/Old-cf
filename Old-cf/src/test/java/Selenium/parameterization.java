package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	//String driverpath= "D:\\drivers\\geckodriver\\geckodriver.exe";
	//String url="https://qa.lockthedeal.com";
	WebDriver driver;
	@Parameters({"driverexe","url"})
	@BeforeMethod
	public void startup(String driverexe, String url){
		System.setProperty("webdriver.gecko.driver",driverexe);
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	@Parameters({"username","password"})
	public void testLogin(String username1, String password1){
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(username1);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(password1);
		driver.findElement(By.id("submit")).click();
		driver.getTitle();
		String expect = "Buy Inverter Battery, Car Battery, Mobiles and Accessories Online in India | LockTheDeal.";
		Assert.assertEquals(driver.getTitle(), expect);	
		System.out.println("usrename is " +username1 );
		System.out.println("and password is" +password1);
		
	}
	@Test
	@Parameters({"searchkey"})
	public void searchItems(String searchkey){
		driver.findElement(By.id("search")).sendKeys("searchkey");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	
	@AfterMethod
	public void stop(){
		driver.quit();
	}

}
