package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysql.jdbc.StringUtils;

public class Accordion {
	static WebDriver driver;
	
	@BeforeMethod
	public void startUp() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");
	//System.getProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/accordion-and-tabs/");
		Thread.sleep(4);
	}
/*	@Test
	public void A1(){
		//Clicking on the accordion
	    int ifram= driver.findElements(By.tagName("iframe")).size();
	    System.out.println(+ifram);
	    
	    WebElement myiframe= driver.findElement(By.xpath("//iframe[@src ='../../demoSite/practice/accordion/collapsible.html']"));
	    driver.switchTo().frame(myiframe);	    
		WebElement acc= driver.findElement(By.cssSelector("h3#ui-id-3")); 
		acc.click();
		
		//View the Accordion
		WebElement accView= driver.findElement(By.xpath("//*[@id='ui-id-4']"));
		String aTxt=accView.getText();
		System.out.println("A1 txt is " +aTxt);
		String expected= "Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.";
		Assert.assertEquals(aTxt, expected);
	}*/
	@Test
	public void allA1(){
		//Clicking on the accordion
	    int ifram= driver.findElements(By.tagName("iframe")).size();
	    System.out.println(+ifram);
	    
	   List<WebElement> allifram= driver.findElements(By.tagName("iframe"));
	   List<String> list=new ArrayList<>();
	   //String[] allsrc = mysrc;
	    for(WebElement frame: allifram){
	    	System.out.println("Frame are " +frame);
	    	String tempUrl = frame.getAttribute("src");
	    	if(!StringUtils.isEmptyOrWhitespaceOnly(tempUrl) && tempUrl.startsWith("https://www.globalsqa.com")){
	    		list.add(tempUrl);
	    	}
	    }
	    for(String url: list){
	    	System.out.println(url);
	    	driver.get(url);
//	    	WebElement myiframe= driver.findElement(By.xpath("//iframe[@src ='../../demoSite/practice/accordion/collapsible.html']"));
//		    driver.switchTo().frame(myiframe);	    
			WebElement acc= driver.findElement(By.cssSelector("h3#ui-id-3")); 
			acc.click();
			WebElement accView= driver.findElement(By.xpath("//*[@id='ui-id-4']"));
			String aTxt=accView.getText();
			System.out.println("A1 txt is " +aTxt);
			String expected= "Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.";
			Assert.assertEquals(aTxt, expected);
		    
	    }
	    /*if(allifram.size()>=15){
	    	driver.switchTo().defaultContent();
	    }*/
//	    WebElement myiframe= driver.findElement(By.xpath("//iframe[@src ='../../demoSite/practice/accordion/collapsible.html']"));
//	    driver.switchTo().frame(myiframe);	    
//		WebElement acc= driver.findElement(By.cssSelector("h3#ui-id-3")); 
//		acc.click();
//		
//		//View the Accordion
//		WebElement accView= driver.findElement(By.xpath("//*[@id='ui-id-4']"));
//		String aTxt=accView.getText();
//		System.out.println("A1 txt is " +aTxt);
//		String expected= "Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.";
//		Assert.assertEquals(aTxt, expected);
	}
	@AfterMethod
	public void stop(){
		driver.quit();
	}
}
