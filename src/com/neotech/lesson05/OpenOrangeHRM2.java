package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class OpenOrangeHRM2 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		//This lime will read Configuration.properties file
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String browser = ConfigsReader.getProperty("browser");
		
		System.out.println(browser);
		
		
	
		if(ConfigsReader.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();

		System.out.println(" I want to open chrome browser");
		}
		else if (ConfigsReader.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
	    driver = new FirefoxDriver();

	    System.out.println(" I want to open firefox browser");
		}
	    
	    String website = ConfigsReader.getProperty("url");
	    driver.get(website);
	    System.out.println(website);
	  
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    Thread.sleep(3000);
	    driver.quit();
}
	}


