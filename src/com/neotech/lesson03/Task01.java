package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	

		public final static String url = "https://facebook.com/";
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get(url);
			
			driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("jamesbond@neotech.com");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("12345");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
			
			Thread.sleep(007);
			
			if (driver.getCurrentUrl()!=url)
			{
				System.out.println("test passed");
			}
			
			else
			{
				System.out.println("test failed");
			}
			
			driver.close();

	}

}
