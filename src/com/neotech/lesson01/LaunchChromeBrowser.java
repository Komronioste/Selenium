package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Full Path --> C:\\Users\\TWD Admin\\eclipse-workspace\\Selenium\\drivers\\chromedriver
		// Relative Path --> drivers/chromedriver
		
		// for Windows --> chromedriver.exe   // for Mac --> chromedriver
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // --> where our driver is located
		
		//Declaring a variable of type WebDriver interface (upcasting)
		// Calling constructor of ChromeDriver
		
		WebDriver driver = new ChromeDriver(); // or new SafariDriver(); or new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");  //The web page where I want to navigate/ opens this website using chrome
		
		System.out.println("URL: " + driver.getCurrentUrl());	//returns our url
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Thread.sleep(15000); // 2000 miliseconds, 2 seconds. this command stops Java execution for 2 seconds.
		
		driver.close(); // to close the current tab
		
//		driver.quit(); // to close the whole browser
	}

}
