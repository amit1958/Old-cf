package Selenium;

import org.openqa.selenium.WebDriver;

public class Constants {
	 public static  WebDriver driver;
	
    public static final String URL = "http://qa.lockthedeal.com/login/auth";
    public static final String URL1 = "https://qa.lockthedeal.com/";

    public static final String Username = "9811854502";

    public static final String Password = "1234";

    public static final String Path_TestData = "D:\\";

    public static final String File_TestData = "TestData.xlsx";
    
    public static final String product= "https://qa.lockthedeal.com/exide-mileage-mred-35r-35ah-(24m+24m)/p/5950fbf0e4b07a6904ed785c?autoSuggestClicked=true";
    
    public static void browser(){
    	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver\\chromedriver.exe");

    	//System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver\\geckodriver.exe");

    }
   

 }
