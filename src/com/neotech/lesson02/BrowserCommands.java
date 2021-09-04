package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://facebook.com/");
		driver.navigate().to("https://github.com/"); // navigates to different page, (saves the history) .get doesnt save history
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize(); // --> makes full screen  .maximize for windows, .maximize for mac
		
		Thread.sleep(1000);
		
		driver.navigate().refresh(); // refresh page
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://amazon.com/"); //navigates to different website
		
		Thread.sleep(1000);
			
		driver.navigate().back();	//navigates back to previous page
		
		driver.navigate().forward(); // navigate back to forward page
		
		Thread.sleep(1000);
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}

}
