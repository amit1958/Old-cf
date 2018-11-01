package Selenium;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Pages {
static public FirefoxDriver driver;

	 public static void loginPage(String username1,  String password1){

			System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
//			System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
			driver= new FirefoxDriver();
			
//			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Constants.URL);
			
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(username1);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(password1);
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		WebElement loginicon=driver.findElement(By.xpath("//div[@class='btn btn-userIcon']"));
		Actions mouse= new Actions(driver);
		mouse.moveToElement(loginicon).build().perform();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement validate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a['Logout']")));
		validate.isDisplayed();
		//WebElement validateLogin=driver.findElement(By.xpath("//li/a['Logout']"));
				//String validate1=validate.getText();
				System.out.println("Text is " +validate);
				//String expected= "Logout";
				Assert.assertEquals(validate, true);
	 }

	public void homePage() throws InterruptedException{
		 driver= new FirefoxDriver();
		 driver.get(Constants.URL);
		 
		 String[] links = null;
//		 int linksCount = 0;
		 List<WebElement> linksize = driver.findElements(By.tagName("a")); 
		 int linksCount = linksize.size();
		 System.out.println("Total no of links Available: "+linksCount);
		// links= new String[linksCount];
		 System.out.println("List of links Available: ");  

		// print all the links from webpage 
		 for(int i=0;i<linksCount;i++)
		 {
		 //links[i] = linksize.get(i).getAttribute("href");
		 System.out.println(links);
		 } 
		 // navigate to each Link on the webpage
		 for(int i=0;i<linksCount;i++)
		 {
		 //driver.navigate().to(i);
		 Thread.sleep(3000);
		 }
		 }
		
	     
	 
}	
		
		
		
		
		
		
		
		

	 

