package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicHandPopUp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
		   driver= new FirefoxDriver();
		   driver.get(Constants.URL);
		   //Alert a = driver.switchTo().alert();
				  // a.accept();
				   simulateKeyboard();
			
	}

	public static void simulateKeyboard() throws InterruptedException {
		driver.findElement(By.cssSelector("a.already-user-login-now.buy-now-button")).click();
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys("9811854502");
		driver.findElement(By.id("loginusername")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("1234");
		driver.findElement(By.id("submit")).click();
		driver.quit();
		
	}

}
