package Selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLinks {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	    	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			String homePage = "https://qa.lockthedeal.com/";
			String url = "";
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        
	        driver.manage().window().maximize();
	        driver.get(homePage);
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        Iterator<WebElement> it = links.iterator();
	        while(it.hasNext())
	        {
	            url = it.next().getAttribute("href");
	            if(url == null || url.isEmpty())
	            {
	            	System.out.println(url + " URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
	            if(!url.startsWith(homePage))
	            {
	                System.out.println(url + " URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try 
	            {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                huc.setRequestMethod("HEAD");
	                huc.connect();
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400)
	                {
	                      System.out.println(url+" is a broken link");
	                    
	                }
	                else
	                {
	                   // System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        driver.quit();

	    }
	}

