package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZillowTest {

	public static void main(String[] args) {
		
		/*
		 * TC 1: Page URL Verification:
			Open chrome browser
			Navigate to “https://www.zillow.com/”
			Navigate to “https://www.google.com/”
			Navigate back to Zillow Page
			Refresh current page
			Verify url contains “Zillow”
		 */
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://zillow.com/");
		driver.navigate().to("https://google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String verify = (driver.getCurrentUrl().contains("zillow")) ? "test passed" : "test failed";
		
		System.out.println(verify);
		
		driver.close();

	}

}
