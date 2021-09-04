package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfxHomework {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver(); //open firefox driver
		
		String url = "https://www.redfin.com/";
		
		dr.get(url); //navigate to "https://www.redfin.com/"
		
		String actualUrl = dr.getCurrentUrl(); // gives me current URL as a string
	
		dr.getTitle(); // 
		
		String result = (url.equals(actualUrl)) ? "test passed" : "test failed";  //check if test passes
		
		System.out.println(result);
		
		Thread.sleep(500);  //wait for 0.5 seconds
		
		dr.quit();
		

	}

}
