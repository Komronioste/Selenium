package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redfin.com/");
		
		String title = driver.getTitle();
		
		String result = (driver.getCurrentUrl().equalsIgnoreCase("https://www.redfin.com/")) ? "correct URL" : "wrong URL";
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(result);
		
		

		Thread.sleep(3000);
		driver.close();
	}

}
