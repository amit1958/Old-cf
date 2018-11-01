package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class driverClass {
	static public FirefoxDriver driver;
	 static public void myDriver(){
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
		driver= new FirefoxDriver();
		
//		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		
	}
	

}
