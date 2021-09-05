package com.neotech.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//We read the configuration file
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		FileInputStream fis = new FileInputStream(filePath);
		
		//We load all the rows in key=value pair
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		WebDriver driver = null;
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println(" I want to open chrome browser");
}
else if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	driver = new FirefoxDriver();

	System.out.println(" I want to open firefox browser");
}
		
		String website = prop.getProperty("url");
		driver.get(website);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
