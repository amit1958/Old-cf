package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class baseClass {
	
	public baseClass() throws FileNotFoundException{
		
	}
	WebDriver driver;
	Properties mypr;
	File myfile= new File(".\\Object-Repo");
	FileInputStream stream= new FileInputStream(myfile);
	

}
