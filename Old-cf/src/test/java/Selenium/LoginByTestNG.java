package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.java.bm.Tetapi;
import resources.TestData;

public class LoginByTestNG {
	static WebDriver driver;
	
 //static String url ="http://qa.lockthedeal.com";
	@BeforeMethod

	
 public static void setUp(){
		
		//Constants.browser();
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
		driver= new FirefoxDriver();
		
//		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		JavascriptExecutor java= (JavascriptExecutor)driver;
		java.executeScript("alert('Test is staring up');");
	}
	
	@Test(dataProvider="credentials")
	public  void LoginTest(String username1, String password1)
	{
		//driver.navigate().to("http://www.lockthedeal.com/login/auth");
		//driver.findElement(By.cssSelector("a.already-user-login-now.buy-now-button")).click();
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(username1);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(password1);
		driver.findElement(By.id("submit")).click();
		String expect = "Orders";
		Assert.assertEquals(driver.getTitle(), expect);	
		System.out.println("usrename is " +username1 );
		System.out.println("and password is" +password1);
		
	}
	
	//Datadriver using Two dimension Array.
	
	@DataProvider(name = "credentials")
	public Object[][] getData(){
		TestData mydata= new TestData("C:/Users/amit.sharma/workspace/Old-cf/TestData.xlsx"); 
		int rows=mydata.getRowCount(0);
		Object[][] data= new Object[rows][2];
		for(int i=0;i<rows; i++)
		{
			data[i][0]=mydata.getData(0, i, 0);
			data[i][1]= mydata.getData(0, i, 1);
		}
		/*
		Object[][] mydata= new Object[2][2];
		mydata[0][0]="9811854502";
		mydata[0][1]="1234";
		
		mydata[1][0]="9811854503";
		mydata[1][1]="1234"	;	
		return mydata;
		*/
		return data;
		
	}
	
	@Test
	public  void searchTest(){
		driver.findElement(By.id("search")).sendKeys("exide");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	
	@Test
	public void pdpTest(){
		driver.navigate().to(Constants.product);
		String pdptitle = driver.getTitle();
		Assert.assertEquals(pdptitle, "Buy Exide Mileage MI35R 35Ah (24M+24M) online at wholesale price in India | LockTheDeal");
	}
	
	
	@AfterMethod
	public static void testDown(){
		driver.quit();
	}
}
