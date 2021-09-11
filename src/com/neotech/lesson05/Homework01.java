package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.neotech.utils.*;
public class Homework01 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); 
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.cssSelector("#txtUsername"));
		login.sendKeys("Admin");
		
		WebElement pw = driver.findElement(By.cssSelector("#txtPassword"));
		pw.sendKeys("admin123");
	
		WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));
		loginButton.submit();
		
		WebElement welcomeMsg = driver.findElement(By.cssSelector("#welcome"));
		boolean wlcmMsg = welcomeMsg.isDisplayed();
		System.out.println("Welcome message is displayed? " + wlcmMsg);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
