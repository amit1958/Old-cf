package Selenium;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class placeorderTest {
	
		
		static WebDriver driver;
	 //static String url ="http://qa.lockthedeal.com";
		@BeforeMethod
		
	 public static void setUp(){
		
			System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
//			System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
			driver= new FirefoxDriver();
			
//			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(Constants.URL);
		}
		/*
		@Test(dataProvider="credentials",  dataProviderClass = LoginByTestNG.class)
		public static void PriceValidationTest(String username1, String password1) throws InterruptedException
		{
			//driver.navigate().to("http://www.lockthedeal.com/login/auth");
			driver.findElement(By.cssSelector("a.already-user-login-now.buy-now-button")).click();
			WebElement username= driver.findElement(By.id("loginusername"));
			username.sendKeys(username1);
			WebElement password= driver.findElement(By.id("password"));
			password.sendKeys(password1);
			driver.findElement(By.id("submit")).click();
			//Thread.sleep(7000);
			String expect = "Orders";
			Assert.assertEquals(driver.getTitle(), expect);	
			driver.navigate().to(Constants.URL1);
			 driver.navigate().to(Constants.product);
			boolean price = driver.getPageSource().contains("3826.25");
			System.out.println("price is ="  +price);
			assertEquals(price, true);		
		}
		*/
		@Test(dataProvider="credentials",  dataProviderClass = LoginByTestNG.class)
		public void AddtoCartTest(String username1, String password1) throws InterruptedException{
	
			driver.findElement(By.cssSelector("a.already-user-login-now.buy-now-button")).click();
			WebElement username= driver.findElement(By.id("loginusername"));
			username.sendKeys(username1);
			WebElement password= driver.findElement(By.id("password"));
			password.sendKeys(password1);
			driver.findElement(By.id("submit")).click();
			//driver.findElement(By.cssSelector("button.add-cart-button.remove-storage")).click();
			driver.findElement(By.cssSelector("button.buy-now-button.remove-storage")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Deliver to this address')]")).click();
			driver.findElement(By.xpath("(//input[@name='paymentOption'])[2]")).click();
			driver.findElement(By.id("checkoutcommitbutton")).click();
			driver.findElement(By.id("checkoutcommitbutton")).click();
		}
		
		@AfterMethod
		public void teardown(){
			driver.quit();
			
		}
		
		
		
}
