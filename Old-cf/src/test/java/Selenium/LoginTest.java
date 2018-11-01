package Selenium;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {

@Test
public void loginTest(){
	Pages myLogin= new Pages();
		myLogin.loginPage("9811854502", "1234");
	
		
}
@Test(priority=1) // All link on home page
public void homepage() throws InterruptedException{
	Pages myhome= new Pages();
	myhome.homePage();
}
}

