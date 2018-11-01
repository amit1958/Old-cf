package TestNG_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeSuite
	public void ok()
	{
		System.out.println("before suit");
	}
	
	@BeforeMethod
	public void start() throws IOException
	{
			
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\browser driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		File f = new File(".\\OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		
		driver.get(pr.getProperty("url"));
		
}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void generate_report() throws Exception
	{
	System.out.println("After suite run first");
	Thread.sleep(3000);
	Xl.generateReport(".\\SuiteReport.xlsx");
	System.out.println("After suite");
	
	}

}
