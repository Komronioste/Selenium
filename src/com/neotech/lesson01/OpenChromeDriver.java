package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String actualURL = driver.getCurrentUrl();
		
		String expectedUrl = "https://www.google.com/";
		
		if (actualURL.equalsIgnoreCase(expectedUrl)) {
			
			System.out.println("Title: " + driver.getTitle());
		}
		
		else {
			System.out.println("This URL is wrong!");
		}
	
		Thread.sleep(3000);
		driver.close();
	}

}
