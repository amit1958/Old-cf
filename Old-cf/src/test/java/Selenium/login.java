package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class login {
		//Login all valid and invalid scenarios
	
		
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
			
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionnette", false);
			//driver = new ChromeDriver();
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("http://www.batterywale.com/batterywale/manufacturers/Car-Batteries/Uttar-Pradesh/Lucknow/");
			driver.get("http://www.batterywale.com/batterywale/manufacturer/Car-Batteries/Alfa-Romeo/Karnataka/Bangalore/");
			List<WebElement> list=driver.findElements(By.xpath("//*[@href or @src]"));

		       for(WebElement e : list){
		           String link = e.getAttribute("href");
		           if(null==link)
		               link=e.getAttribute("src");
		           System.out.println(e.getTagName() + "=" + link);
		       }
	}

}
