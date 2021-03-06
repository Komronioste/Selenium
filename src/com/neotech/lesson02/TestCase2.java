package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Murat");
		
		driver.findElement(By.name("lastName")).sendKeys("Tashpulatov");
		
		driver.findElement(By.name("phone")).sendKeys("123456789");
		
		driver.findElement(By.name("email")).sendKeys("murat@neotech.com");
		
		Thread.sleep(1500);
				
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
