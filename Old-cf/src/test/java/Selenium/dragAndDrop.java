package Selenium;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dragAndDrop {
	WebDriver driver;
	@BeforeMethod
	public void startUp(){
	
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/draggableboxes/");
	}
	@Test
	public void dragandDrop() throws InterruptedException{
		WebElement drop=driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/draggable/default.html']"));
		driver.switchTo().frame(drop);
		WebElement dragitem= driver.findElement(By.xpath("//*[@id='draggable']"));
		Point boxlocation= dragitem.getLocation();
		int xcor= boxlocation.getX(); 
		int ycor=boxlocation.getY();
		System.out.println(xcor + "  " + ycor);
		Actions act= new Actions(driver);
		act.clickAndHold(dragitem).dragAndDropBy(dragitem, 100, 50).build().perform();
		int expected= 100;
		Assert.assertEquals(xcor, expected);
		
		//how to muliple select items from the list nox
		
		//Actions drag = act.clickAndHold(dragitem.get(2)).clickAndHold(dragitem.get(5)).click();
		
		// how to slide the slider
    /*    Actions slider= act.clickAndHold(dropitem).moveByOffset(100, 0);
		slider.release().perform();
		
		//how to double click on element
		act.doubleClick(dropitem).perform();
				;
		Action myaction= drag.build();
		myaction.perform();
				//drag.perform();
		//drag.dragAndDrop(dragitem, dropitem).build().perform();
		//drag.dragAndDropBy(dragitem, 100, 100).build().perform();
		// How to alert using JS
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("alert('Drag the item in the horizontal wise.')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	*/
	}
	
	@AfterMethod
	public void stop(){
	driver.quit();	
	}
	

}
