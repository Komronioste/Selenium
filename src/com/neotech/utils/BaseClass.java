package com.neotech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver setUp()
	{
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
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
		
		driver.get(ConfigsReader.getProperty("url"));
		return driver;
	}

	public static void tearDown()
	{
		if(driver != null)
		  driver.close();
	}
}
