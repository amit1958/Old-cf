package Selenium;


import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipleSelection {

WebDriver driver;
@BeforeMethod
public void startUp(){
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.globalsqa.com/demo-site/select-elements/");
}
@Test
public void multipleSelect(){
	WebElement iframe= driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/selectable/default.html']"));
	driver.switchTo().frame(iframe);
	List <WebElement> select1= driver.findElements(By.xpath("//*[@id='selectable']/li"));
	int size=select1.size();
	
	System.out.println("Size is  " + size);
	Actions selectAll= new Actions(driver);
	for(WebElement myelem: select1){
	selectAll.keyDown(Keys.CONTROL).click(myelem).keyUp(Keys.CONTROL).build().perform();
	System.out.println("selected Element is" +myelem);
	}
//	WebElement select4= driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));
//	select4.click();
	
	
}
}
