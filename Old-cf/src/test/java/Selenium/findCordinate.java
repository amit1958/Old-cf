package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public  class findCordinate {
	static WebDriver driver;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
   @BeforeMethod
   public void startUp(){
	
// Constants.browser();
System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
driver= new FirefoxDriver();
		
//		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get(Constants.URL);
		 driver.get("http://qa.lockthedeal.com/");
	}
   
   @Test(priority=1)
   public void cordinate(){
	  // driver.get("http://qa.lockthedeal.com/") 
	 List<WebElement> items = driver.findElements(By.xpath("//*[@id='popularBlock']/div[1]/div[2]/div"));
	 int item= items.size();
	 	System.out.println(+item);
	 	for(WebElement we : items){
	 		String pname=we.getText();
	 		System.out.println(""+pname);
	 	}
   
   }
	 
	 	   //driver.findElement(By.cssSelector("a.already-user-login-now.buy-now-button")).click();
//		WebElement username= driver.findElement(By.id("loginusername"));
//		Point xcordinate= username.getLocation();
//		int xcord =xcordinate.getX();
//		int ycord=xcordinate.getY();
//		
//		System.out.println("xcordinate is " + xcord);
//		System.out.println("Ycordinate is " + ycord);
//		Actions mouse = new Actions(driver);
//		mouse.moveToElement(username, 200, 200).click().build().perform();
   }

   
 
	


