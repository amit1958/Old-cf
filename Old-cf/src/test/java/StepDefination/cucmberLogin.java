package StepDefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucmberLogin {
	WebDriver driver;
	
	@Given("^Go to the web page$")
public void startup() throws Throwable	
{
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lockthedeal.com/login/auth");
}
	@And("^Enter the user name and password$")
	public void loginpage()throws Throwable	
	
	{
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys("9811854502");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("2124");	
	}
	@When("^Submit the Login page$")
	public void submit() throws Throwable	
	{
		driver.findElement(By.id("submit")).click();
	}
	@Then("^User should navigate to the login page and comes with Logout link$")
	public void validation() throws Throwable	
	{
	Actions myaction= new Actions(driver);
	WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li/a/b"));
	myaction.moveToElement(profile).build().perform();
	String logout= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li/ul/li[13]/a")).getText();
	//String myvalidation= logout.getText();
	String expected= "Log Out";
	Assert.assertEquals(logout, expected);
	driver.quit();
	}
}
