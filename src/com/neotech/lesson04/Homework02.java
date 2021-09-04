package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {

	public final static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		List<WebElement> buttons = driver.findElements(By.cssSelector("label[class*='custom-control']"));
		System.out.println(buttons.size());
		
		for (WebElement el : buttons)
		{
			if(el.isDisplayed()) {
				System.out.println("Displayed");
				el.click();}
			if(el.isEnabled())
				System.out.println("Enabled");
		
				
		}
		Thread.sleep(1000);
		driver.close();
	
}
}