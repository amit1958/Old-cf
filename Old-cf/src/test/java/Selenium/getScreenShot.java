package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class getScreenShot{
	
public void getScreen() throws IOException{	
File srcfile= ((TakesScreenshot)Constants.driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(srcfile, new File("D:\\Amit"));
 
}
}

	
